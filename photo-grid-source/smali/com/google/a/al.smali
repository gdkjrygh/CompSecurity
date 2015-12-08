.class final Lcom/google/a/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/a/an;


# instance fields
.field private final a:Lcom/google/a/c/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/c/a",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Z

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/a/af;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/af",
            "<*>;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/a/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/w",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Object;Lcom/google/a/c/a;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/a/c/a",
            "<*>;Z)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    instance-of v0, p1, Lcom/google/a/af;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/a/af;

    :goto_0
    iput-object v0, p0, Lcom/google/a/al;->d:Lcom/google/a/af;

    .line 120
    instance-of v0, p1, Lcom/google/a/w;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/google/a/w;

    :goto_1
    iput-object p1, p0, Lcom/google/a/al;->e:Lcom/google/a/w;

    .line 123
    iget-object v0, p0, Lcom/google/a/al;->d:Lcom/google/a/af;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/a/al;->e:Lcom/google/a/w;

    if-eqz v0, :cond_3

    :cond_0
    const/4 v0, 0x1

    :goto_2
    invoke-static {v0}, Lcom/google/a/b/a;->a(Z)V

    .line 124
    iput-object p2, p0, Lcom/google/a/al;->a:Lcom/google/a/c/a;

    .line 125
    iput-boolean p3, p0, Lcom/google/a/al;->b:Z

    .line 126
    iput-object v1, p0, Lcom/google/a/al;->c:Ljava/lang/Class;

    .line 127
    return-void

    :cond_1
    move-object v0, v1

    .line 117
    goto :goto_0

    :cond_2
    move-object p1, v1

    .line 120
    goto :goto_1

    .line 123
    :cond_3
    const/4 v0, 0x0

    goto :goto_2
.end method

.method synthetic constructor <init>(Ljava/lang/Object;Lcom/google/a/c/a;ZB)V
    .locals 0

    .prologue
    .line 108
    invoke-direct {p0, p1, p2, p3}, Lcom/google/a/al;-><init>(Ljava/lang/Object;Lcom/google/a/c/a;Z)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/a/k;Lcom/google/a/c/a;)Lcom/google/a/am;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/a/k;",
            "Lcom/google/a/c/a",
            "<TT;>;)",
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 131
    iget-object v0, p0, Lcom/google/a/al;->a:Lcom/google/a/c/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/a/al;->a:Lcom/google/a/c/a;

    invoke-virtual {v0, p2}, Lcom/google/a/c/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/a/al;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/a/al;->a:Lcom/google/a/c/a;

    invoke-virtual {v0}, Lcom/google/a/c/a;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/a/c/a;->a()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 134
    :goto_0
    if-eqz v0, :cond_3

    new-instance v0, Lcom/google/a/ak;

    iget-object v1, p0, Lcom/google/a/al;->d:Lcom/google/a/af;

    iget-object v2, p0, Lcom/google/a/al;->e:Lcom/google/a/w;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/a/ak;-><init>(Lcom/google/a/af;Lcom/google/a/w;Lcom/google/a/k;Lcom/google/a/c/a;Lcom/google/a/an;B)V

    :goto_1
    return-object v0

    :cond_1
    move v0, v6

    .line 131
    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/a/al;->c:Ljava/lang/Class;

    invoke-virtual {p2}, Lcom/google/a/c/a;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    goto :goto_0

    .line 134
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method
