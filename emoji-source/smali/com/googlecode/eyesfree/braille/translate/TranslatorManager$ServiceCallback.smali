.class Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;
.super Lcom/googlecode/eyesfree/braille/translate/ITranslatorServiceCallback$Stub;
.source "TranslatorManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ServiceCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;


# direct methods
.method private constructor <init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorServiceCallback$Stub;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;

    .prologue
    .line 218
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;-><init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V

    return-void
.end method


# virtual methods
.method public onInit(I)V
    .locals 1
    .param p1, "status"    # I

    .prologue
    .line 221
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mHandler:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$600(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->onInit(I)V

    .line 222
    return-void
.end method
