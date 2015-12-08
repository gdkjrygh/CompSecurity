.class final Lcom/miteksystems/misnap/t;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/speech/tts/TextToSpeech$OnInitListener;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/s;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/s;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/t;->a:Lcom/miteksystems/misnap/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInit(I)V
    .locals 3

    iget-object v0, p0, Lcom/miteksystems/misnap/t;->a:Lcom/miteksystems/misnap/s;

    iget-object v0, v0, Lcom/miteksystems/misnap/s;->b:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->x()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/t;->a:Lcom/miteksystems/misnap/s;

    invoke-static {v0}, Lcom/miteksystems/misnap/s;->a(Lcom/miteksystems/misnap/s;)Landroid/speech/tts/TextToSpeech;

    move-result-object v0

    new-instance v1, Ljava/util/Locale;

    iget-object v2, p0, Lcom/miteksystems/misnap/t;->a:Lcom/miteksystems/misnap/s;

    iget-object v2, v2, Lcom/miteksystems/misnap/s;->b:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->x()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    :cond_0
    return-void
.end method
