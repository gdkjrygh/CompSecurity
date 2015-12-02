.class Lcom/nineoldandroids/a/m$a;
.super Lcom/nineoldandroids/a/m;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/a/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field h:Lcom/nineoldandroids/a/f;

.field i:F

.field private j:Lcom/nineoldandroids/util/a;


# direct methods
.method public varargs constructor <init>(Lcom/nineoldandroids/util/c;[F)V
    .locals 1

    .prologue
    .line 922
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/a/m;-><init>(Lcom/nineoldandroids/util/c;Lcom/nineoldandroids/a/m;)V

    .line 923
    invoke-virtual {p0, p2}, Lcom/nineoldandroids/a/m$a;->a([F)V

    .line 924
    instance-of v0, p1, Lcom/nineoldandroids/util/a;

    if-eqz v0, :cond_0

    .line 925
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->b:Lcom/nineoldandroids/util/c;

    check-cast v0, Lcom/nineoldandroids/util/a;

    iput-object v0, p0, Lcom/nineoldandroids/a/m$a;->j:Lcom/nineoldandroids/util/a;

    .line 927
    :cond_0
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[F)V
    .locals 1

    .prologue
    .line 917
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/a/m;-><init>(Ljava/lang/String;Lcom/nineoldandroids/a/m;)V

    .line 918
    invoke-virtual {p0, p2}, Lcom/nineoldandroids/a/m$a;->a([F)V

    .line 919
    return-void
.end method


# virtual methods
.method public synthetic a()Lcom/nineoldandroids/a/m;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/nineoldandroids/a/m$a;->e()Lcom/nineoldandroids/a/m$a;

    move-result-object v0

    return-object v0
.end method

.method a(F)V
    .locals 1

    .prologue
    .line 937
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->h:Lcom/nineoldandroids/a/f;

    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/f;->b(F)F

    move-result v0

    iput v0, p0, Lcom/nineoldandroids/a/m$a;->i:F

    .line 938
    return-void
.end method

.method a(Ljava/lang/Class;)V
    .locals 1

    .prologue
    .line 987
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->b:Lcom/nineoldandroids/util/c;

    if-eqz v0, :cond_0

    .line 1021
    :goto_0
    return-void

    .line 1019
    :cond_0
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/Class;)V

    goto :goto_0
.end method

.method public varargs a([F)V
    .locals 1

    .prologue
    .line 931
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/m;->a([F)V

    .line 932
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->e:Lcom/nineoldandroids/a/j;

    check-cast v0, Lcom/nineoldandroids/a/f;

    iput-object v0, p0, Lcom/nineoldandroids/a/m$a;->h:Lcom/nineoldandroids/a/f;

    .line 933
    return-void
.end method

.method b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 961
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->j:Lcom/nineoldandroids/util/a;

    if-eqz v0, :cond_1

    .line 962
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->j:Lcom/nineoldandroids/util/a;

    iget v1, p0, Lcom/nineoldandroids/a/m$a;->i:F

    invoke-virtual {v0, p1, v1}, Lcom/nineoldandroids/util/a;->a(Ljava/lang/Object;F)V

    .line 983
    :cond_0
    :goto_0
    return-void

    .line 965
    :cond_1
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->b:Lcom/nineoldandroids/util/c;

    if-eqz v0, :cond_2

    .line 966
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->b:Lcom/nineoldandroids/util/c;

    iget v1, p0, Lcom/nineoldandroids/a/m$a;->i:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/nineoldandroids/util/c;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 973
    :cond_2
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    .line 975
    :try_start_0
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->g:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/nineoldandroids/a/m$a;->i:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    .line 976
    iget-object v0, p0, Lcom/nineoldandroids/a/m$a;->c:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lcom/nineoldandroids/a/m$a;->g:[Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 977
    :catch_0
    move-exception v0

    goto :goto_0

    .line 979
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 942
    iget v0, p0, Lcom/nineoldandroids/a/m$a;->i:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/nineoldandroids/a/m$a;
    .locals 2

    .prologue
    .line 947
    invoke-super {p0}, Lcom/nineoldandroids/a/m;->a()Lcom/nineoldandroids/a/m;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/m$a;

    .line 948
    iget-object v1, v0, Lcom/nineoldandroids/a/m$a;->e:Lcom/nineoldandroids/a/j;

    check-cast v1, Lcom/nineoldandroids/a/f;

    iput-object v1, v0, Lcom/nineoldandroids/a/m$a;->h:Lcom/nineoldandroids/a/f;

    .line 949
    return-object v0
.end method
