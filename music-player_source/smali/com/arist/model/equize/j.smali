.class public final Lcom/arist/model/equize/j;
.super Ljava/lang/Object;


# static fields
.field private static h:Lcom/arist/model/equize/j;


# instance fields
.field public a:Landroid/media/audiofx/Equalizer;

.field public b:Landroid/media/audiofx/Virtualizer;

.field public c:Landroid/media/audiofx/BassBoost;

.field public d:Landroid/media/audiofx/PresetReverb;

.field public e:Lcom/arist/model/equize/k;

.field private f:Landroid/content/Context;

.field private g:Lcom/arist/model/b/b;

.field private i:Z

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private final n:[S


# direct methods
.method private constructor <init>()V
    .locals 6

    const/4 v5, 0x5

    const/4 v4, 0x4

    const/4 v3, 0x3

    const/4 v2, 0x2

    const/4 v1, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/equize/j;->i:Z

    const/4 v0, 0x7

    new-array v0, v0, [S

    aput-short v1, v0, v1

    aput-short v2, v0, v2

    aput-short v3, v0, v3

    aput-short v4, v0, v4

    aput-short v5, v0, v5

    const/4 v1, 0x6

    const/4 v2, 0x6

    aput-short v2, v0, v1

    iput-object v0, p0, Lcom/arist/model/equize/j;->n:[S

    return-void
.end method

.method public static a()Lcom/arist/model/equize/j;
    .locals 1

    sget-object v0, Lcom/arist/model/equize/j;->h:Lcom/arist/model/equize/j;

    if-nez v0, :cond_0

    new-instance v0, Lcom/arist/model/equize/j;

    invoke-direct {v0}, Lcom/arist/model/equize/j;-><init>()V

    sput-object v0, Lcom/arist/model/equize/j;->h:Lcom/arist/model/equize/j;

    :cond_0
    sget-object v0, Lcom/arist/model/equize/j;->h:Lcom/arist/model/equize/j;

    return-object v0
.end method

.method private a(Landroid/media/audiofx/AudioEffect;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, v0}, Lcom/arist/model/equize/j;->a(Landroid/media/audiofx/AudioEffect;Z)V

    invoke-virtual {p1}, Landroid/media/audiofx/AudioEffect;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private a(Landroid/media/audiofx/AudioEffect;Z)V
    .locals 1

    :try_start_0
    invoke-virtual {p1}, Landroid/media/audiofx/AudioEffect;->getEnabled()Z

    move-result v0

    if-eq v0, p2, :cond_0

    invoke-virtual {p1, p2}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/arist/model/equize/j;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/Exception;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/equize/j;->i:Z

    invoke-virtual {p0}, Lcom/arist/model/equize/j;->c()V

    return-void
.end method


# virtual methods
.method public final a(D)V
    .locals 5

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    double-to-float v1, p1

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/k;->b(F)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->c:Landroid/media/audiofx/BassBoost;

    iget v1, p0, Lcom/arist/model/equize/j;->m:I

    int-to-double v2, v1

    mul-double/2addr v2, p1

    double-to-int v1, v2

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Landroid/media/audiofx/BassBoost;->setStrength(S)V

    return-void
.end method

.method public final a(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0, p1}, Lcom/arist/model/equize/k;->b(I)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->d:Landroid/media/audiofx/PresetReverb;

    invoke-virtual {v0}, Landroid/media/audiofx/PresetReverb;->getProperties()Landroid/media/audiofx/PresetReverb$Settings;

    new-instance v0, Landroid/media/audiofx/PresetReverb$Settings;

    invoke-direct {v0}, Landroid/media/audiofx/PresetReverb$Settings;-><init>()V

    iget-object v1, p0, Lcom/arist/model/equize/j;->n:[S

    aget-short v1, v1, p1

    iput-short v1, v0, Landroid/media/audiofx/PresetReverb$Settings;->preset:S

    iget-object v1, p0, Lcom/arist/model/equize/j;->d:Landroid/media/audiofx/PresetReverb;

    invoke-virtual {v1, v0}, Landroid/media/audiofx/PresetReverb;->setProperties(Landroid/media/audiofx/PresetReverb$Settings;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/arist/model/equize/j;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public final a(II)V
    .locals 3

    iget-object v0, p0, Lcom/arist/model/equize/j;->a:Landroid/media/audiofx/Equalizer;

    int-to-short v1, p1

    int-to-short v2, p2

    invoke-virtual {v0, v1, v2}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

    return-void
.end method

.method public final a(Landroid/content/Context;I)V
    .locals 2

    invoke-virtual {p0}, Lcom/arist/model/equize/j;->c()V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/equize/j;->f:Landroid/content/Context;

    new-instance v0, Lcom/arist/model/b/b;

    iget-object v1, p0, Lcom/arist/model/equize/j;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/arist/model/b/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/model/equize/j;->g:Lcom/arist/model/b/b;

    new-instance v0, Lcom/arist/model/equize/k;

    iget-object v1, p0, Lcom/arist/model/equize/j;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/arist/model/equize/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    new-instance v0, Landroid/media/audiofx/Equalizer;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p2}, Landroid/media/audiofx/Equalizer;-><init>(II)V

    iput-object v0, p0, Lcom/arist/model/equize/j;->a:Landroid/media/audiofx/Equalizer;

    new-instance v0, Landroid/media/audiofx/Virtualizer;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p2}, Landroid/media/audiofx/Virtualizer;-><init>(II)V

    iput-object v0, p0, Lcom/arist/model/equize/j;->b:Landroid/media/audiofx/Virtualizer;

    new-instance v0, Landroid/media/audiofx/BassBoost;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p2}, Landroid/media/audiofx/BassBoost;-><init>(II)V

    iput-object v0, p0, Lcom/arist/model/equize/j;->c:Landroid/media/audiofx/BassBoost;

    new-instance v0, Landroid/media/audiofx/PresetReverb;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p2}, Landroid/media/audiofx/PresetReverb;-><init>(II)V

    iput-object v0, p0, Lcom/arist/model/equize/j;->d:Landroid/media/audiofx/PresetReverb;

    iget-object v0, p0, Lcom/arist/model/equize/j;->a:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v0

    const/4 v1, 0x1

    aget-short v0, v0, v1

    iput v0, p0, Lcom/arist/model/equize/j;->j:I

    iget-object v0, p0, Lcom/arist/model/equize/j;->a:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v0

    const/4 v1, 0x0

    aget-short v0, v0, v1

    iput v0, p0, Lcom/arist/model/equize/j;->k:I

    iget-object v0, p0, Lcom/arist/model/equize/j;->c:Landroid/media/audiofx/BassBoost;

    invoke-virtual {v0}, Landroid/media/audiofx/BassBoost;->getRoundedStrength()S

    move-result v0

    iput v0, p0, Lcom/arist/model/equize/j;->m:I

    iget-object v0, p0, Lcom/arist/model/equize/j;->b:Landroid/media/audiofx/Virtualizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Virtualizer;->getRoundedStrength()S

    move-result v0

    iput v0, p0, Lcom/arist/model/equize/j;->l:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/arist/model/equize/j;->a(Z)V

    invoke-virtual {p0}, Lcom/arist/model/equize/j;->b()Lcom/arist/b/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arist/model/equize/j;->a(Lcom/arist/b/a;)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0}, Lcom/arist/model/equize/k;->e()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p0, v0, v1}, Lcom/arist/model/equize/j;->a(D)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0}, Lcom/arist/model/equize/k;->d()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p0, v0, v1}, Lcom/arist/model/equize/j;->b(D)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0}, Lcom/arist/model/equize/k;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arist/model/equize/j;->a(I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/equize/j;->i:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-boolean v0, p0, Lcom/arist/model/equize/j;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0}, Lcom/arist/model/equize/k;->b()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arist/model/equize/j;->a(Z)V

    :cond_0
    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lcom/arist/model/equize/j;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public final a(Lcom/arist/b/a;)V
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    iget v2, p1, Lcom/arist/b/a;->g:I

    invoke-virtual {v0, v2}, Lcom/arist/model/equize/k;->a(I)V

    if-nez p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v1, v0}, Lcom/arist/model/equize/j;->a(II)V

    const/4 v2, 0x1

    if-nez p1, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {p0, v2, v0}, Lcom/arist/model/equize/j;->a(II)V

    const/4 v2, 0x2

    if-nez p1, :cond_2

    move v0, v1

    :goto_2
    invoke-virtual {p0, v2, v0}, Lcom/arist/model/equize/j;->a(II)V

    const/4 v2, 0x3

    if-nez p1, :cond_3

    move v0, v1

    :goto_3
    invoke-virtual {p0, v2, v0}, Lcom/arist/model/equize/j;->a(II)V

    const/4 v0, 0x4

    if-nez p1, :cond_4

    :goto_4
    invoke-virtual {p0, v0, v1}, Lcom/arist/model/equize/j;->a(II)V

    return-void

    :cond_0
    iget v0, p1, Lcom/arist/b/a;->b:I

    goto :goto_0

    :cond_1
    iget v0, p1, Lcom/arist/b/a;->c:I

    goto :goto_1

    :cond_2
    iget v0, p1, Lcom/arist/b/a;->d:I

    goto :goto_2

    :cond_3
    iget v0, p1, Lcom/arist/b/a;->e:I

    goto :goto_3

    :cond_4
    iget v1, p1, Lcom/arist/b/a;->f:I

    goto :goto_4
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0, p1}, Lcom/arist/model/equize/k;->a(Z)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->b:Landroid/media/audiofx/Virtualizer;

    invoke-direct {p0, v0, p1}, Lcom/arist/model/equize/j;->a(Landroid/media/audiofx/AudioEffect;Z)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->c:Landroid/media/audiofx/BassBoost;

    invoke-direct {p0, v0, p1}, Lcom/arist/model/equize/j;->a(Landroid/media/audiofx/AudioEffect;Z)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->d:Landroid/media/audiofx/PresetReverb;

    invoke-direct {p0, v0, p1}, Lcom/arist/model/equize/j;->a(Landroid/media/audiofx/AudioEffect;Z)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->a:Landroid/media/audiofx/Equalizer;

    invoke-direct {p0, v0, p1}, Lcom/arist/model/equize/j;->a(Landroid/media/audiofx/AudioEffect;Z)V

    return-void
.end method

.method public final b()Lcom/arist/b/a;
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/j;->g:Lcom/arist/model/b/b;

    iget-object v1, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v1}, Lcom/arist/model/equize/k;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/model/b/b;->a(I)Lcom/arist/b/a;

    move-result-object v0

    return-object v0
.end method

.method public final b(D)V
    .locals 5

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    double-to-float v1, p1

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/k;->a(F)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->b:Landroid/media/audiofx/Virtualizer;

    iget v1, p0, Lcom/arist/model/equize/j;->l:I

    int-to-double v2, v1

    mul-double/2addr v2, p1

    double-to-int v1, v2

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Virtualizer;->setStrength(S)V

    return-void
.end method

.method public final b(Lcom/arist/b/a;)V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/j;->g:Lcom/arist/model/b/b;

    invoke-virtual {v0, p1}, Lcom/arist/model/b/b;->c(Lcom/arist/b/a;)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    iget v1, p1, Lcom/arist/b/a;->g:I

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/k;->a(I)V

    return-void
.end method

.method public final c()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/arist/model/equize/j;->a:Landroid/media/audiofx/Equalizer;

    invoke-direct {p0, v0}, Lcom/arist/model/equize/j;->a(Landroid/media/audiofx/AudioEffect;)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->b:Landroid/media/audiofx/Virtualizer;

    invoke-direct {p0, v0}, Lcom/arist/model/equize/j;->a(Landroid/media/audiofx/AudioEffect;)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->c:Landroid/media/audiofx/BassBoost;

    invoke-direct {p0, v0}, Lcom/arist/model/equize/j;->a(Landroid/media/audiofx/AudioEffect;)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->d:Landroid/media/audiofx/PresetReverb;

    invoke-direct {p0, v0}, Lcom/arist/model/equize/j;->a(Landroid/media/audiofx/AudioEffect;)V

    iput-object v1, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    iput-object v1, p0, Lcom/arist/model/equize/j;->f:Landroid/content/Context;

    iput-object v1, p0, Lcom/arist/model/equize/j;->g:Lcom/arist/model/b/b;

    return-void
.end method

.method public final c(Lcom/arist/b/a;)V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/j;->g:Lcom/arist/model/b/b;

    invoke-virtual {v0, p1}, Lcom/arist/model/b/b;->b(Lcom/arist/b/a;)V

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0}, Lcom/arist/model/equize/k;->a()I

    move-result v0

    iget v1, p1, Lcom/arist/b/a;->g:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/k;->a(I)V

    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/arist/model/equize/j;->j:I

    return v0
.end method

.method public final d(Lcom/arist/b/a;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/j;->g:Lcom/arist/model/b/b;

    invoke-virtual {v0, p1}, Lcom/arist/model/b/b;->a(Lcom/arist/b/a;)V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/arist/model/equize/j;->i:Z

    return v0
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/j;->g:Lcom/arist/model/b/b;

    invoke-virtual {v0}, Lcom/arist/model/b/b;->b()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/j;->g:Lcom/arist/model/b/b;

    invoke-virtual {v0}, Lcom/arist/model/b/b;->a()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
