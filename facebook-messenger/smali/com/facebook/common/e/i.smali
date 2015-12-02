.class public Lcom/facebook/common/e/i;
.super Lcom/facebook/common/e/a;
.source "FbErrorReporterImpl.java"


# static fields
.field public static final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lorg/acra/ErrorReporter;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/lang/String;


# instance fields
.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/ExecutorService;

.field private final f:Ljava/util/Random;

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lorg/acra/ErrorReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 25
    const-class v0, Lcom/facebook/common/e/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/e/i;->b:Ljava/lang/String;

    .line 44
    new-instance v0, Lcom/facebook/common/e/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/common/e/l;-><init>(Lcom/facebook/common/e/j;)V

    sput-object v0, Lcom/facebook/common/e/i;->a:Ljavax/inject/a;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Ljava/util/concurrent/ExecutorService;Ljava/util/Random;Ljavax/inject/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/Random;",
            "Ljavax/inject/a",
            "<",
            "Lorg/acra/ErrorReporter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 61
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/common/e/i;-><init>(Ljavax/inject/a;Ljavax/inject/a;Ljava/util/concurrent/ExecutorService;Ljava/util/Random;Ljavax/inject/a;Z)V

    .line 69
    return-void
.end method

.method constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Ljava/util/concurrent/ExecutorService;Ljava/util/Random;Ljavax/inject/a;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/Random;",
            "Ljavax/inject/a",
            "<",
            "Lorg/acra/ErrorReporter;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/common/e/a;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/facebook/common/e/i;->c:Ljavax/inject/a;

    .line 79
    iput-object p2, p0, Lcom/facebook/common/e/i;->d:Ljavax/inject/a;

    .line 80
    iput-object p3, p0, Lcom/facebook/common/e/i;->e:Ljava/util/concurrent/ExecutorService;

    .line 81
    iput-object p4, p0, Lcom/facebook/common/e/i;->f:Ljava/util/Random;

    .line 82
    iput-object p5, p0, Lcom/facebook/common/e/i;->g:Ljavax/inject/a;

    .line 83
    iput-boolean p6, p0, Lcom/facebook/common/e/i;->h:Z

    .line 84
    return-void
.end method

.method private a(Ljava/lang/String;IZ)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 221
    iget-object v0, p0, Lcom/facebook/common/e/i;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/e/i;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v0, v3, :cond_2

    :cond_0
    move v0, v2

    .line 225
    :goto_0
    if-nez v0, :cond_1

    .line 226
    if-eqz p3, :cond_3

    move-object p1, v1

    .line 238
    :cond_1
    :goto_1
    return-object p1

    .line 221
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 229
    :cond_3
    iget-object v0, p0, Lcom/facebook/common/e/i;->f:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    rem-int/2addr v0, p2

    if-eqz v0, :cond_4

    move-object p1, v1

    .line 231
    goto :goto_1

    .line 233
    :cond_4
    if-eq p2, v2, :cond_1

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " [freq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/common/e/i;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/common/e/i;->g:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/common/e/i;)Z
    .locals 1

    .prologue
    .line 23
    iget-boolean v0, p0, Lcom/facebook/common/e/i;->h:Z

    return v0
.end method


# virtual methods
.method public a(Lcom/facebook/common/e/m;)V
    .locals 5

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/common/e/i;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/common/e/i;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 90
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/common/e/m;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 91
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v0

    .line 92
    const-string v1, "soft_error_message"

    invoke-virtual {p1}, Lcom/facebook/common/e/m;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\n"

    const-string v4, "\\n"

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    sget-object v0, Lcom/facebook/common/e/i;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "category: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/common/e/m;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " message:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/common/e/m;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Soft error FAILING HARDER: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/common/e/m;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/common/e/m;->c()Ljava/lang/Throwable;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 88
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 99
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/common/e/m;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/common/e/m;->e()I

    move-result v1

    invoke-virtual {p1}, Lcom/facebook/common/e/m;->f()Z

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/common/e/i;->a(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v1

    .line 106
    if-nez v1, :cond_3

    .line 137
    :goto_1
    return-void

    .line 109
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/common/e/m;->b()Ljava/lang/String;

    move-result-object v2

    .line 110
    invoke-virtual {p1}, Lcom/facebook/common/e/m;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/facebook/common/e/m;->c()Ljava/lang/Throwable;

    move-result-object v0

    .line 114
    :goto_2
    iget-object v3, p0, Lcom/facebook/common/e/i;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lcom/facebook/common/e/j;

    invoke-direct {v4, p0, v1, v2, v0}, Lcom/facebook/common/e/j;-><init>(Lcom/facebook/common/e/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 110
    :cond_4
    new-instance v0, Ljava/lang/Exception;

    const-string v3, "Soft error"

    invoke-virtual {p1}, Lcom/facebook/common/e/m;->c()Ljava/lang/Throwable;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 209
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/acra/ErrorReporter;->removeCustomData(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 179
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/facebook/common/e/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 184
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 145
    const/4 v0, 0x0

    invoke-direct {p0, p1, p4, v0}, Lcom/facebook/common/e/i;->a(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v0

    .line 148
    if-nez v0, :cond_0

    .line 172
    :goto_0
    return-void

    .line 153
    :cond_0
    iget-object v1, p0, Lcom/facebook/common/e/i;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/facebook/common/e/k;

    invoke-direct {v2, p0, v0, p2, p3}, Lcom/facebook/common/e/k;-><init>(Lcom/facebook/common/e/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 204
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    return-void
.end method
