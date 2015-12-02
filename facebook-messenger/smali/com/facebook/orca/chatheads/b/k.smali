.class public Lcom/facebook/orca/chatheads/b/k;
.super Ljava/lang/Object;
.source "ChatHeadNuxController.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/chatheads/b/f;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/common/e/h;

.field private f:Landroid/content/Context;

.field private g:Lcom/facebook/orca/chatheads/b/f;

.field private h:Lcom/facebook/orca/chatheads/b/f;

.field private i:Z

.field private j:Z

.field private k:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/facebook/orca/chatheads/b/k;

    sput-object v0, Lcom/facebook/orca/chatheads/b/k;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/prefs/shared/d;Landroid/os/Handler;Lcom/facebook/common/e/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/chatheads/b/f;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/prefs/shared/d;",
            "Landroid/os/Handler;",
            "Lcom/facebook/common/e/h;",
            ")V"
        }
    .end annotation

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/facebook/orca/chatheads/b/k;->f:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lcom/facebook/orca/chatheads/b/k;->b:Ljavax/inject/a;

    .line 52
    iput-object p3, p0, Lcom/facebook/orca/chatheads/b/k;->c:Ljavax/inject/a;

    .line 53
    iput-object p4, p0, Lcom/facebook/orca/chatheads/b/k;->d:Lcom/facebook/prefs/shared/d;

    .line 54
    iput-object p6, p0, Lcom/facebook/orca/chatheads/b/k;->e:Lcom/facebook/common/e/h;

    .line 55
    iput-object p5, p0, Lcom/facebook/orca/chatheads/b/k;->k:Landroid/os/Handler;

    .line 56
    return-void
.end method

.method private a(Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;)V
    .locals 3

    .prologue
    .line 108
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/k;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    :goto_0
    return-void

    .line 114
    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/b/k;->p()Lcom/facebook/orca/chatheads/b/f;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 124
    invoke-virtual {v0, p2}, Lcom/facebook/orca/chatheads/b/f;->a(Lcom/facebook/orca/chatheads/b/e;)V

    .line 125
    iget v1, p1, Landroid/graphics/Point;->x:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/f;->b(I)V

    .line 126
    iget v1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/f;->g(I)V

    .line 127
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/orca/chatheads/b/k;->i:Z

    .line 128
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->d()V

    goto :goto_0

    .line 115
    :catch_0
    move-exception v0

    .line 118
    const-string v1, "T2190668:wm_ex_add_first_chat_head_nux"

    const-string v2, "Failed to add first chat head nux window"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/chatheads/b/k;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/RemoteException;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/b/k;Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/b/k;->a(Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Landroid/os/RemoteException;)V
    .locals 5

    .prologue
    .line 268
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    const-string v0, ":\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 275
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    const-string v4, "\n"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 278
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 279
    sget-object v1, Lcom/facebook/orca/chatheads/b/k;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 280
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/k;->e:Lcom/facebook/common/e/h;

    invoke-interface {v1, p1, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    return-void
.end method

.method private o()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 202
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->b()V

    .line 204
    iput-object v1, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    .line 207
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    if-eqz v0, :cond_1

    .line 208
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->b()V

    .line 209
    iput-object v1, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    .line 211
    :cond_1
    return-void
.end method

.method private p()Lcom/facebook/orca/chatheads/b/f;
    .locals 2

    .prologue
    .line 218
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    if-nez v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/f;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    .line 220
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 221
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    sget v1, Lcom/facebook/o;->chat_heads_first_message_sms_enabled_nux:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/f;->a(I)V

    .line 225
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->a()V

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    return-object v0

    .line 223
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    sget v1, Lcom/facebook/o;->chat_heads_first_message_nux:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/f;->a(I)V

    goto :goto_0
.end method

.method private q()Lcom/facebook/orca/chatheads/b/f;
    .locals 2

    .prologue
    .line 244
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    if-nez v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/f;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    sget v1, Lcom/facebook/o;->chat_heads_close_nux:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/f;->a(I)V

    .line 247
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/a;->setContentGravitiy(I)V

    .line 248
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/a;->a(Z)V

    .line 249
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->a()V

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;I)V
    .locals 2

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->k:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 86
    if-lez p3, :cond_0

    .line 87
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/orca/chatheads/b/k;->b(Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;I)V

    .line 91
    :goto_0
    return-void

    .line 89
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/b/k;->a(Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;)V

    goto :goto_0
.end method

.method public a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 59
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/k;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->m:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public b(Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;I)V
    .locals 4

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->k:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->k:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/chatheads/b/l;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/orca/chatheads/b/l;-><init>(Lcom/facebook/orca/chatheads/b/k;Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;)V

    int-to-long v2, p3

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 103
    return-void
.end method

.method public b()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 68
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/k;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->n:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/k;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/b/k;->j:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()V
    .locals 4

    .prologue
    .line 132
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/k;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    if-eqz v0, :cond_1

    .line 160
    :cond_0
    :goto_0
    return-void

    .line 138
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/b/k;->q()Lcom/facebook/orca/chatheads/b/f;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 149
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/k;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 150
    sget-object v2, Lcom/facebook/orca/chatheads/b/e;->BOTTOM:Lcom/facebook/orca/chatheads/b/e;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/b/f;->a(Lcom/facebook/orca/chatheads/b/e;)V

    .line 151
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/f;->b(I)V

    .line 152
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/f;->g(I)V

    .line 153
    const-wide/16 v1, 0x1388

    new-instance v3, Lcom/facebook/orca/chatheads/b/m;

    invoke-direct {v3, p0}, Lcom/facebook/orca/chatheads/b/m;-><init>(Lcom/facebook/orca/chatheads/b/k;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/chatheads/b/f;->a(JLcom/facebook/orca/chatheads/b/j;)V

    goto :goto_0

    .line 139
    :catch_0
    move-exception v0

    .line 142
    const-string v1, "T2190668:wm_ex_add_close_nux"

    const-string v2, "Failed to add chat head close nux window"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/chatheads/b/k;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/RemoteException;)V

    goto :goto_0
.end method

.method public f()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->k:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->c()V

    .line 166
    iput-object v1, p0, Lcom/facebook/orca/chatheads/b/k;->g:Lcom/facebook/orca/chatheads/b/f;

    .line 168
    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->c()V

    .line 173
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->h:Lcom/facebook/orca/chatheads/b/f;

    .line 175
    :cond_0
    return-void
.end method

.method public h()V
    .locals 0

    .prologue
    .line 178
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/k;->f()V

    .line 179
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/k;->g()V

    .line 180
    return-void
.end method

.method public i()V
    .locals 2

    .prologue
    .line 183
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->m:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->n:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 187
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/b/k;->j:Z

    .line 188
    return-void
.end method

.method public j()V
    .locals 1

    .prologue
    .line 191
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/b/k;->j:Z

    .line 192
    return-void
.end method

.method public k()V
    .locals 0

    .prologue
    .line 198
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/b/k;->o()V

    .line 199
    return-void
.end method

.method public l()Z
    .locals 1

    .prologue
    .line 236
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/b/k;->i:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/k;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public m()V
    .locals 3

    .prologue
    .line 255
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 256
    sget-object v1, Lcom/facebook/orca/prefs/o;->m:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 257
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 258
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/b/k;->i:Z

    .line 259
    return-void
.end method

.method public n()V
    .locals 3

    .prologue
    .line 262
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/k;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 263
    sget-object v1, Lcom/facebook/orca/prefs/o;->n:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 264
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 265
    return-void
.end method
