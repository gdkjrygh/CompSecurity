.class Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;
.super Ljava/lang/Object;
.source "AccessibilityInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/accessibility/AccessibilityInjector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TextToSpeechWrapper"
.end annotation


# instance fields
.field private final mSelfBrailleClient:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

.field private final mTextToSpeech:Landroid/speech/tts/TextToSpeech;

.field private final mView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/content/Context;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    const/4 v1, 0x0

    .line 401
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 402
    iput-object p1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mView:Landroid/view/View;

    .line 403
    new-instance v0, Landroid/speech/tts/TextToSpeech;

    invoke-direct {v0, p2, v1, v1}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mTextToSpeech:Landroid/speech/tts/TextToSpeech;

    .line 404
    new-instance v0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    invoke-static {}, Lorg/chromium/base/CommandLine;->getInstance()Lorg/chromium/base/CommandLine;

    move-result-object v1

    const-string v2, "debug-braille-service"

    invoke-virtual {v1, v2}, Lorg/chromium/base/CommandLine;->hasSwitch(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {v0, p2, v1}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mSelfBrailleClient:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    .line 406
    return-void
.end method


# virtual methods
.method public braille(Ljava/lang/String;)V
    .locals 5
    .param p1, "jsonString"    # Ljava/lang/String;
    .annotation runtime Lorg/chromium/content/browser/JavascriptInterface;
    .end annotation

    .prologue
    .line 453
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 455
    .local v2, "jsonObj":Lorg/json/JSONObject;
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mView:Landroid/view/View;

    invoke-static {v3}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->forView(Landroid/view/View;)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    move-result-object v0

    .line 456
    .local v0, "data":Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
    const-string v3, "text"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->setText(Ljava/lang/CharSequence;)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    .line 457
    const-string v3, "startIndex"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->setSelectionStart(I)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    .line 458
    const-string v3, "endIndex"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;->setSelectionEnd(I)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    .line 459
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mSelfBrailleClient:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    invoke-virtual {v3, v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->write(Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 463
    .end local v0    # "data":Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
    .end local v2    # "jsonObj":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 460
    :catch_0
    move-exception v1

    .line 461
    .local v1, "ex":Lorg/json/JSONException;
    const-string v3, "AccessibilityInjector"

    const-string v4, "Error parsing JS JSON object"

    invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public isSpeaking()Z
    .locals 1
    .annotation runtime Lorg/chromium/content/browser/JavascriptInterface;
    .end annotation

    .prologue
    .line 411
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mTextToSpeech:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->isSpeaking()Z

    move-result v0

    return v0
.end method

.method protected shutdownInternal()V
    .locals 1

    .prologue
    .line 467
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mTextToSpeech:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V

    .line 468
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mSelfBrailleClient:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    invoke-virtual {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->shutdown()V

    .line 469
    return-void
.end method

.method public speak(Ljava/lang/String;ILjava/lang/String;)I
    .locals 7
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "queueMode"    # I
    .param p3, "jsonParams"    # Ljava/lang/String;
    .annotation runtime Lorg/chromium/content/browser/JavascriptInterface;
    .end annotation

    .prologue
    .line 418
    const/4 v4, 0x0

    .line 420
    .local v4, "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz p3, :cond_1

    .line 421
    :try_start_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 422
    .end local v4    # "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .local v5, "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 426
    .local v1, "json":Lorg/json/JSONObject;
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 428
    .local v3, "keyIt":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 429
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 431
    .local v2, "key":Ljava/lang/String;
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    if-nez v6, :cond_0

    .line 432
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 436
    .end local v1    # "json":Lorg/json/JSONObject;
    .end local v2    # "key":Ljava/lang/String;
    .end local v3    # "keyIt":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :catch_0
    move-exception v0

    move-object v4, v5

    .line 437
    .end local v5    # "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .local v0, "e":Lorg/json/JSONException;
    .restart local v4    # "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :goto_1
    const/4 v4, 0x0

    .line 440
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_1
    :goto_2
    iget-object v6, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mTextToSpeech:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v6, p1, p2, v4}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/String;ILjava/util/HashMap;)I

    move-result v6

    return v6

    .line 436
    :catch_1
    move-exception v0

    goto :goto_1

    .end local v4    # "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v1    # "json":Lorg/json/JSONObject;
    .restart local v3    # "keyIt":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .restart local v5    # "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_2
    move-object v4, v5

    .end local v5    # "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v4    # "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    goto :goto_2
.end method

.method public stop()I
    .locals 1
    .annotation runtime Lorg/chromium/content/browser/JavascriptInterface;
    .end annotation

    .prologue
    .line 446
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->mTextToSpeech:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I

    move-result v0

    return v0
.end method
