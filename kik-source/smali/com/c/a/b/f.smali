.class final Lcom/c/a/b/f;
.super Lcom/c/a/b/j;
.source "SourceFile"


# static fields
.field static final a:Lcom/c/a/b/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/c/a/b/f;

    invoke-direct {v0}, Lcom/c/a/b/f;-><init>()V

    sput-object v0, Lcom/c/a/b/f;->a:Lcom/c/a/b/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/c/a/b/j;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/c/a/b/j;
    .locals 0

    .prologue
    .line 36
    return-object p0
.end method

.method public final b()Lcom/c/a/b/v;
    .locals 1

    .prologue
    .line 56
    invoke-static {}, Lcom/c/a/b/v;->g()Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method

.method final c()Lcom/c/a/b/v;
    .locals 2

    .prologue
    .line 61
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final d()Lcom/c/a/b/v;
    .locals 1

    .prologue
    .line 71
    invoke-static {}, Lcom/c/a/b/v;->g()Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 28
    invoke-static {}, Lcom/c/a/b/v;->g()Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 51
    const/4 v0, 0x0

    return-object v0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 28
    invoke-static {}, Lcom/c/a/b/v;->g()Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    return v0
.end method
