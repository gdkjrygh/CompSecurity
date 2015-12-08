.class final Landroid/support/v4/speech/tts/TextToSpeechICSMR1$1;
.super Landroid/speech/tts/UtteranceProgressListener;
.source "SourceFile"


# instance fields
.field final synthetic val$listener:Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;


# direct methods
.method constructor <init>(Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$1;->val$listener:Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;

    invoke-direct {p0}, Landroid/speech/tts/UtteranceProgressListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDone(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$1;->val$listener:Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;

    invoke-interface {v0, p1}, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;->onDone(Ljava/lang/String;)V

    .line 61
    return-void
.end method

.method public final onError(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$1;->val$listener:Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;

    invoke-interface {v0, p1}, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;->onError(Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method public final onStart(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$1;->val$listener:Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;

    invoke-interface {v0, p1}, Landroid/support/v4/speech/tts/TextToSpeechICSMR1$UtteranceProgressListenerICSMR1;->onStart(Ljava/lang/String;)V

    .line 51
    return-void
.end method
