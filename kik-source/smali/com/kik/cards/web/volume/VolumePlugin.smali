.class public Lcom/kik/cards/web/volume/VolumePlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Ljava/lang/Object;

.field private d:Z

.field private final e:Lcom/kik/g/f;

.field private final f:Lcom/kik/g/k;

.field private final g:Lcom/kik/g/k;

.field private h:Lcom/kik/g/c;

.field private i:Lcom/kik/g/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-string v0, "CardsWebVolume"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/volume/VolumePlugin;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 54
    const-string v0, "VolumeKeys"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 28
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->b:Ljava/lang/Object;

    .line 31
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->e:Lcom/kik/g/f;

    .line 33
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->f:Lcom/kik/g/k;

    .line 34
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->g:Lcom/kik/g/k;

    .line 36
    new-instance v0, Lcom/kik/cards/web/volume/a;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/volume/a;-><init>(Lcom/kik/cards/web/volume/VolumePlugin;)V

    invoke-static {v0}, Lcom/kik/g/j;->a(Lcom/kik/g/i;)Lcom/kik/g/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->h:Lcom/kik/g/c;

    .line 44
    new-instance v0, Lcom/kik/cards/web/volume/b;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/volume/b;-><init>(Lcom/kik/cards/web/volume/VolumePlugin;)V

    invoke-static {v0}, Lcom/kik/g/j;->a(Lcom/kik/g/i;)Lcom/kik/g/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->i:Lcom/kik/g/c;

    .line 55
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/volume/VolumePlugin;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/kik/cards/web/volume/VolumePlugin;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/kik/cards/web/volume/VolumePlugin;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/kik/cards/web/volume/VolumePlugin;->c(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 85
    const/4 v1, 0x0

    .line 87
    iget-boolean v2, p0, Lcom/kik/cards/web/volume/VolumePlugin;->d:Z

    if-eqz v2, :cond_0

    .line 88
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :cond_0
    move v0, v1

    .line 111
    :cond_1
    :goto_0
    return v0

    .line 90
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_2

    .line 91
    iget-object v1, p0, Lcom/kik/cards/web/volume/VolumePlugin;->f:Lcom/kik/g/k;

    iget-object v2, p0, Lcom/kik/cards/web/volume/VolumePlugin;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 93
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_1

    .line 94
    iget-object v1, p0, Lcom/kik/cards/web/volume/VolumePlugin;->h:Lcom/kik/g/c;

    invoke-virtual {v1}, Lcom/kik/g/c;->a()V

    goto :goto_0

    .line 100
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_3

    .line 101
    iget-object v1, p0, Lcom/kik/cards/web/volume/VolumePlugin;->g:Lcom/kik/g/k;

    iget-object v2, p0, Lcom/kik/cards/web/volume/VolumePlugin;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 103
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_1

    .line 104
    iget-object v1, p0, Lcom/kik/cards/web/volume/VolumePlugin;->i:Lcom/kik/g/c;

    invoke-virtual {v1}, Lcom/kik/g/c;->a()V

    goto :goto_0

    .line 88
    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public startIntercepting(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 60
    iget-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->e:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 63
    iget-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->e:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/volume/VolumePlugin;->f:Lcom/kik/g/k;

    invoke-virtual {v1}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/volume/VolumePlugin;->h:Lcom/kik/g/c;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 64
    iget-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->e:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/volume/VolumePlugin;->g:Lcom/kik/g/k;

    invoke-virtual {v1}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/volume/VolumePlugin;->i:Lcom/kik/g/c;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->d:Z

    .line 68
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method

.method public stopIntercepting(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 74
    iget-object v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->e:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 78
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/volume/VolumePlugin;->d:Z

    .line 80
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method
