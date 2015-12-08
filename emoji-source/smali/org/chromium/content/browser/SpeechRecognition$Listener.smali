.class Lorg/chromium/content/browser/SpeechRecognition$Listener;
.super Ljava/lang/Object;
.source "SpeechRecognition.java"

# interfaces
.implements Landroid/speech/RecognitionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/SpeechRecognition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Listener"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/SpeechRecognition;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 63
    const-class v0, Lorg/chromium/content/browser/SpeechRecognition;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lorg/chromium/content/browser/SpeechRecognition;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private handleResults(Landroid/os/Bundle;Z)V
    .locals 7
    .param p1, "bundle"    # Landroid/os/Bundle;
    .param p2, "provisional"    # Z

    .prologue
    .line 152
    iget-object v1, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    # getter for: Lorg/chromium/content/browser/SpeechRecognition;->mContinuous:Z
    invoke-static {v1}, Lorg/chromium/content/browser/SpeechRecognition;->access$300(Lorg/chromium/content/browser/SpeechRecognition;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p2, :cond_0

    .line 154
    const/4 p2, 0x0

    .line 157
    :cond_0
    const-string v1, "results_recognition"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 159
    .local v0, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/String;

    .line 161
    .local v4, "results":[Ljava/lang/String;
    const-string v1, "confidence_scores"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getFloatArray(Ljava/lang/String;)[F

    move-result-object v5

    .line 163
    .local v5, "scores":[F
    iget-object v1, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    iget-object v2, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    # getter for: Lorg/chromium/content/browser/SpeechRecognition;->mNativeSpeechRecognizerImplAndroid:J
    invoke-static {v2}, Lorg/chromium/content/browser/SpeechRecognition;->access$100(Lorg/chromium/content/browser/SpeechRecognition;)J

    move-result-wide v2

    move v6, p2

    # invokes: Lorg/chromium/content/browser/SpeechRecognition;->nativeOnRecognitionResults(J[Ljava/lang/String;[FZ)V
    invoke-static/range {v1 .. v6}, Lorg/chromium/content/browser/SpeechRecognition;->access$800(Lorg/chromium/content/browser/SpeechRecognition;J[Ljava/lang/String;[FZ)V

    .line 167
    return-void
.end method


# virtual methods
.method public onBeginningOfSpeech()V
    .locals 4

    .prologue
    .line 67
    iget-object v0, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    const/4 v1, 0x2

    # setter for: Lorg/chromium/content/browser/SpeechRecognition;->mState:I
    invoke-static {v0, v1}, Lorg/chromium/content/browser/SpeechRecognition;->access$002(Lorg/chromium/content/browser/SpeechRecognition;I)I

    .line 68
    iget-object v0, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    iget-object v1, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    # getter for: Lorg/chromium/content/browser/SpeechRecognition;->mNativeSpeechRecognizerImplAndroid:J
    invoke-static {v1}, Lorg/chromium/content/browser/SpeechRecognition;->access$100(Lorg/chromium/content/browser/SpeechRecognition;)J

    move-result-wide v2

    # invokes: Lorg/chromium/content/browser/SpeechRecognition;->nativeOnSoundStart(J)V
    invoke-static {v0, v2, v3}, Lorg/chromium/content/browser/SpeechRecognition;->access$200(Lorg/chromium/content/browser/SpeechRecognition;J)V

    .line 69
    return-void
.end method

.method public onBufferReceived([B)V
    .locals 0
    .param p1, "buffer"    # [B

    .prologue
    .line 72
    return-void
.end method

.method public onEndOfSpeech()V
    .locals 4

    .prologue
    .line 81
    iget-object v0, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    # getter for: Lorg/chromium/content/browser/SpeechRecognition;->mContinuous:Z
    invoke-static {v0}, Lorg/chromium/content/browser/SpeechRecognition;->access$300(Lorg/chromium/content/browser/SpeechRecognition;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    iget-object v1, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    # getter for: Lorg/chromium/content/browser/SpeechRecognition;->mNativeSpeechRecognizerImplAndroid:J
    invoke-static {v1}, Lorg/chromium/content/browser/SpeechRecognition;->access$100(Lorg/chromium/content/browser/SpeechRecognition;)J

    move-result-wide v2

    # invokes: Lorg/chromium/content/browser/SpeechRecognition;->nativeOnSoundEnd(J)V
    invoke-static {v0, v2, v3}, Lorg/chromium/content/browser/SpeechRecognition;->access$400(Lorg/chromium/content/browser/SpeechRecognition;J)V

    .line 85
    iget-object v0, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    iget-object v1, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    # getter for: Lorg/chromium/content/browser/SpeechRecognition;->mNativeSpeechRecognizerImplAndroid:J
    invoke-static {v1}, Lorg/chromium/content/browser/SpeechRecognition;->access$100(Lorg/chromium/content/browser/SpeechRecognition;)J

    move-result-wide v2

    # invokes: Lorg/chromium/content/browser/SpeechRecognition;->nativeOnAudioEnd(J)V
    invoke-static {v0, v2, v3}, Lorg/chromium/content/browser/SpeechRecognition;->access$500(Lorg/chromium/content/browser/SpeechRecognition;J)V

    .line 86
    iget-object v0, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    const/4 v1, 0x0

    # setter for: Lorg/chromium/content/browser/SpeechRecognition;->mState:I
    invoke-static {v0, v1}, Lorg/chromium/content/browser/SpeechRecognition;->access$002(Lorg/chromium/content/browser/SpeechRecognition;I)I

    .line 88
    :cond_0
    return-void
.end method

.method public onError(I)V
    .locals 2
    .param p1, "error"    # I

    .prologue
    .line 92
    const/4 v0, 0x0

    .line 95
    .local v0, "code":I
    packed-switch p1, :pswitch_data_0

    .line 118
    sget-boolean v1, Lorg/chromium/content/browser/SpeechRecognition$Listener;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 97
    :pswitch_0
    const/4 v0, 0x2

    .line 122
    :goto_0
    iget-object v1, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    # invokes: Lorg/chromium/content/browser/SpeechRecognition;->terminate(I)V
    invoke-static {v1, v0}, Lorg/chromium/content/browser/SpeechRecognition;->access$600(Lorg/chromium/content/browser/SpeechRecognition;I)V

    .line 123
    :cond_0
    return-void

    .line 100
    :pswitch_1
    const/4 v0, 0x1

    .line 101
    goto :goto_0

    .line 104
    :pswitch_2
    const/4 v0, 0x4

    .line 105
    goto :goto_0

    .line 109
    :pswitch_3
    const/4 v0, 0x3

    .line 110
    goto :goto_0

    .line 112
    :pswitch_4
    const/4 v0, 0x6

    .line 113
    goto :goto_0

    .line 115
    :pswitch_5
    const/4 v0, 0x5

    .line 116
    goto :goto_0

    .line 95
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public onEvent(ILandroid/os/Bundle;)V
    .locals 0
    .param p1, "event"    # I
    .param p2, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 126
    return-void
.end method

.method public onPartialResults(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 130
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/SpeechRecognition$Listener;->handleResults(Landroid/os/Bundle;Z)V

    .line 131
    return-void
.end method

.method public onReadyForSpeech(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 135
    iget-object v0, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    const/4 v1, 0x1

    # setter for: Lorg/chromium/content/browser/SpeechRecognition;->mState:I
    invoke-static {v0, v1}, Lorg/chromium/content/browser/SpeechRecognition;->access$002(Lorg/chromium/content/browser/SpeechRecognition;I)I

    .line 136
    iget-object v0, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    iget-object v1, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    # getter for: Lorg/chromium/content/browser/SpeechRecognition;->mNativeSpeechRecognizerImplAndroid:J
    invoke-static {v1}, Lorg/chromium/content/browser/SpeechRecognition;->access$100(Lorg/chromium/content/browser/SpeechRecognition;)J

    move-result-wide v2

    # invokes: Lorg/chromium/content/browser/SpeechRecognition;->nativeOnAudioStart(J)V
    invoke-static {v0, v2, v3}, Lorg/chromium/content/browser/SpeechRecognition;->access$700(Lorg/chromium/content/browser/SpeechRecognition;J)V

    .line 137
    return-void
.end method

.method public onResults(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    const/4 v1, 0x0

    .line 141
    invoke-direct {p0, p1, v1}, Lorg/chromium/content/browser/SpeechRecognition$Listener;->handleResults(Landroid/os/Bundle;Z)V

    .line 145
    iget-object v0, p0, Lorg/chromium/content/browser/SpeechRecognition$Listener;->this$0:Lorg/chromium/content/browser/SpeechRecognition;

    # invokes: Lorg/chromium/content/browser/SpeechRecognition;->terminate(I)V
    invoke-static {v0, v1}, Lorg/chromium/content/browser/SpeechRecognition;->access$600(Lorg/chromium/content/browser/SpeechRecognition;I)V

    .line 146
    return-void
.end method

.method public onRmsChanged(F)V
    .locals 0
    .param p1, "rms"    # F

    .prologue
    .line 149
    return-void
.end method
