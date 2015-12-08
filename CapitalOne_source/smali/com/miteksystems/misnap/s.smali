.class public final Lcom/miteksystems/misnap/s;
.super Ljava/lang/Object;


# instance fields
.field a:Landroid/content/Context;

.field b:Lcom/miteksystems/misnap/MiSnapAPI;

.field c:Z

.field private d:Landroid/speech/tts/TextToSpeech;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/miteksystems/misnap/MiSnapAPI;Z)V
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/s;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/miteksystems/misnap/s;->b:Lcom/miteksystems/misnap/MiSnapAPI;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/s;->c:Z

    iput-object p1, p0, Lcom/miteksystems/misnap/s;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/miteksystems/misnap/s;->b:Lcom/miteksystems/misnap/MiSnapAPI;

    iput-boolean p3, p0, Lcom/miteksystems/misnap/s;->c:Z

    iget-boolean v0, p0, Lcom/miteksystems/misnap/s;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroid/speech/tts/TextToSpeech;

    iget-object v1, p0, Lcom/miteksystems/misnap/s;->a:Landroid/content/Context;

    new-instance v2, Lcom/miteksystems/misnap/t;

    invoke-direct {v2, p0}, Lcom/miteksystems/misnap/t;-><init>(Lcom/miteksystems/misnap/s;)V

    invoke-direct {v0, v1, v2}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/s;->d:Landroid/speech/tts/TextToSpeech;

    iget-object v0, p0, Lcom/miteksystems/misnap/s;->b:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->x()Ljava/lang/String;

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/miteksystems/misnap/s;)Landroid/speech/tts/TextToSpeech;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/s;->d:Landroid/speech/tts/TextToSpeech;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/s;->c:Z

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/s;->d:Landroid/speech/tts/TextToSpeech;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/s;->d:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    iget-boolean v0, p0, Lcom/miteksystems/misnap/s;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/s;->d:Landroid/speech/tts/TextToSpeech;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/s;->d:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I

    iget-object v0, p0, Lcom/miteksystems/misnap/s;->d:Landroid/speech/tts/TextToSpeech;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/String;ILjava/util/HashMap;)I

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/s;->c:Z

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/s;->d:Landroid/speech/tts/TextToSpeech;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/s;->d:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V

    goto :goto_0
.end method
