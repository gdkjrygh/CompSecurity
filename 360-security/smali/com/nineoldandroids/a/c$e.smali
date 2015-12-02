.class Lcom/nineoldandroids/a/c$e;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field public a:Lcom/nineoldandroids/a/a;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nineoldandroids/a/c$c;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nineoldandroids/a/c$c;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nineoldandroids/a/c$e;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nineoldandroids/a/c$e;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z


# direct methods
.method public constructor <init>(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 923
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 883
    iput-object v0, p0, Lcom/nineoldandroids/a/c$e;->b:Ljava/util/ArrayList;

    .line 894
    iput-object v0, p0, Lcom/nineoldandroids/a/c$e;->c:Ljava/util/ArrayList;

    .line 900
    iput-object v0, p0, Lcom/nineoldandroids/a/c$e;->d:Ljava/util/ArrayList;

    .line 907
    iput-object v0, p0, Lcom/nineoldandroids/a/c$e;->e:Ljava/util/ArrayList;

    .line 914
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nineoldandroids/a/c$e;->f:Z

    .line 924
    iput-object p1, p0, Lcom/nineoldandroids/a/c$e;->a:Lcom/nineoldandroids/a/a;

    .line 925
    return-void
.end method


# virtual methods
.method public a()Lcom/nineoldandroids/a/c$e;
    .locals 2

    .prologue
    .line 951
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/c$e;

    .line 952
    iget-object v1, p0, Lcom/nineoldandroids/a/c$e;->a:Lcom/nineoldandroids/a/a;

    invoke-virtual {v1}, Lcom/nineoldandroids/a/a;->h()Lcom/nineoldandroids/a/a;

    move-result-object v1

    iput-object v1, v0, Lcom/nineoldandroids/a/c$e;->a:Lcom/nineoldandroids/a/a;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 953
    return-object v0

    .line 954
    :catch_0
    move-exception v0

    .line 955
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public a(Lcom/nineoldandroids/a/c$c;)V
    .locals 2

    .prologue
    .line 933
    iget-object v0, p0, Lcom/nineoldandroids/a/c$e;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 934
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nineoldandroids/a/c$e;->b:Ljava/util/ArrayList;

    .line 935
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nineoldandroids/a/c$e;->d:Ljava/util/ArrayList;

    .line 937
    :cond_0
    iget-object v0, p0, Lcom/nineoldandroids/a/c$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 938
    iget-object v0, p0, Lcom/nineoldandroids/a/c$e;->d:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/nineoldandroids/a/c$c;->a:Lcom/nineoldandroids/a/c$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 939
    iget-object v0, p0, Lcom/nineoldandroids/a/c$e;->d:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/nineoldandroids/a/c$c;->a:Lcom/nineoldandroids/a/c$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 941
    :cond_1
    iget-object v0, p1, Lcom/nineoldandroids/a/c$c;->a:Lcom/nineoldandroids/a/c$e;

    .line 942
    iget-object v1, v0, Lcom/nineoldandroids/a/c$e;->e:Ljava/util/ArrayList;

    if-nez v1, :cond_2

    .line 943
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/nineoldandroids/a/c$e;->e:Ljava/util/ArrayList;

    .line 945
    :cond_2
    iget-object v0, v0, Lcom/nineoldandroids/a/c$e;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 946
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/nineoldandroids/a/c$e;->a()Lcom/nineoldandroids/a/c$e;

    move-result-object v0

    return-object v0
.end method
