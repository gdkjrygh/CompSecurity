.class Lcom/a/a/j;
.super Ljava/lang/Object;
.source "AnimatorSet.java"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public a:Lcom/a/a/a;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/a/a/h;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/a/a/h;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/a/a/j;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/a/a/j;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z


# direct methods
.method public constructor <init>(Lcom/a/a/a;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 919
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 879
    iput-object v0, p0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    .line 890
    iput-object v0, p0, Lcom/a/a/j;->c:Ljava/util/ArrayList;

    .line 896
    iput-object v0, p0, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    .line 903
    iput-object v0, p0, Lcom/a/a/j;->e:Ljava/util/ArrayList;

    .line 910
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/a/j;->f:Z

    .line 920
    iput-object p1, p0, Lcom/a/a/j;->a:Lcom/a/a/a;

    .line 921
    return-void
.end method


# virtual methods
.method public a()Lcom/a/a/j;
    .locals 2

    .prologue
    .line 947
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 948
    iget-object v1, p0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v1}, Lcom/a/a/a;->g()Lcom/a/a/a;

    move-result-object v1

    iput-object v1, v0, Lcom/a/a/j;->a:Lcom/a/a/a;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 949
    return-object v0

    .line 950
    :catch_0
    move-exception v0

    .line 951
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public a(Lcom/a/a/h;)V
    .locals 2

    .prologue
    .line 929
    iget-object v0, p0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 930
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    .line 931
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    .line 933
    :cond_0
    iget-object v0, p0, Lcom/a/a/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 934
    iget-object v0, p0, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/a/a/h;->a:Lcom/a/a/j;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 935
    iget-object v0, p0, Lcom/a/a/j;->d:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/a/a/h;->a:Lcom/a/a/j;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 937
    :cond_1
    iget-object v0, p1, Lcom/a/a/h;->a:Lcom/a/a/j;

    .line 938
    iget-object v1, v0, Lcom/a/a/j;->e:Ljava/util/ArrayList;

    if-nez v1, :cond_2

    .line 939
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/a/a/j;->e:Ljava/util/ArrayList;

    .line 941
    :cond_2
    iget-object v0, v0, Lcom/a/a/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 942
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 870
    invoke-virtual {p0}, Lcom/a/a/j;->a()Lcom/a/a/j;

    move-result-object v0

    return-object v0
.end method
