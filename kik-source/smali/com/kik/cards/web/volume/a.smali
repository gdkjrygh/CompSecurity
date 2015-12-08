.class final Lcom/kik/cards/web/volume/a;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/volume/VolumePlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/volume/VolumePlugin;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/kik/cards/web/volume/a;->a:Lcom/kik/cards/web/volume/VolumePlugin;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/cards/web/volume/a;->a:Lcom/kik/cards/web/volume/VolumePlugin;

    const-string v1, "volumeUp"

    invoke-static {v0, v1}, Lcom/kik/cards/web/volume/VolumePlugin;->a(Lcom/kik/cards/web/volume/VolumePlugin;Ljava/lang/String;)V

    .line 41
    return-void
.end method
