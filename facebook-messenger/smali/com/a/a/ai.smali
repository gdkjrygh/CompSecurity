.class Lcom/a/a/ai;
.super Lcom/a/a/ag;
.source "PropertyValuesHolder.java"


# instance fields
.field h:Lcom/a/a/l;

.field i:F

.field private j:Lcom/a/b/a;


# direct methods
.method public varargs constructor <init>(Lcom/a/b/c;[F)V
    .locals 1

    .prologue
    .line 923
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/a/a/ag;-><init>(Lcom/a/b/c;Lcom/a/a/ah;)V

    .line 924
    invoke-virtual {p0, p2}, Lcom/a/a/ai;->a([F)V

    .line 925
    instance-of v0, p1, Lcom/a/b/a;

    if-eqz v0, :cond_0

    .line 926
    iget-object v0, p0, Lcom/a/a/ai;->b:Lcom/a/b/c;

    check-cast v0, Lcom/a/b/a;

    iput-object v0, p0, Lcom/a/a/ai;->j:Lcom/a/b/a;

    .line 928
    :cond_0
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[F)V
    .locals 1

    .prologue
    .line 918
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/a/a/ag;-><init>(Ljava/lang/String;Lcom/a/a/ah;)V

    .line 919
    invoke-virtual {p0, p2}, Lcom/a/a/ai;->a([F)V

    .line 920
    return-void
.end method


# virtual methods
.method public synthetic a()Lcom/a/a/ag;
    .locals 1

    .prologue
    .line 889
    invoke-virtual {p0}, Lcom/a/a/ai;->e()Lcom/a/a/ai;

    move-result-object v0

    return-object v0
.end method

.method a(F)V
    .locals 1

    .prologue
    .line 938
    iget-object v0, p0, Lcom/a/a/ai;->h:Lcom/a/a/l;

    invoke-virtual {v0, p1}, Lcom/a/a/l;->b(F)F

    move-result v0

    iput v0, p0, Lcom/a/a/ai;->i:F

    .line 939
    return-void
.end method

.method a(Ljava/lang/Class;)V
    .locals 1

    .prologue
    .line 988
    iget-object v0, p0, Lcom/a/a/ai;->b:Lcom/a/b/c;

    if-eqz v0, :cond_0

    .line 1022
    :goto_0
    return-void

    .line 1020
    :cond_0
    invoke-super {p0, p1}, Lcom/a/a/ag;->a(Ljava/lang/Class;)V

    goto :goto_0
.end method

.method public varargs a([F)V
    .locals 1

    .prologue
    .line 932
    invoke-super {p0, p1}, Lcom/a/a/ag;->a([F)V

    .line 933
    iget-object v0, p0, Lcom/a/a/ai;->e:Lcom/a/a/p;

    check-cast v0, Lcom/a/a/l;

    iput-object v0, p0, Lcom/a/a/ai;->h:Lcom/a/a/l;

    .line 934
    return-void
.end method

.method b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 962
    iget-object v0, p0, Lcom/a/a/ai;->j:Lcom/a/b/a;

    if-eqz v0, :cond_1

    .line 963
    iget-object v0, p0, Lcom/a/a/ai;->j:Lcom/a/b/a;

    iget v1, p0, Lcom/a/a/ai;->i:F

    invoke-virtual {v0, p1, v1}, Lcom/a/b/a;->a(Ljava/lang/Object;F)V

    .line 984
    :cond_0
    :goto_0
    return-void

    .line 966
    :cond_1
    iget-object v0, p0, Lcom/a/a/ai;->b:Lcom/a/b/c;

    if-eqz v0, :cond_2

    .line 967
    iget-object v0, p0, Lcom/a/a/ai;->b:Lcom/a/b/c;

    iget v1, p0, Lcom/a/a/ai;->i:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/a/b/c;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 974
    :cond_2
    iget-object v0, p0, Lcom/a/a/ai;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    .line 976
    :try_start_0
    iget-object v0, p0, Lcom/a/a/ai;->g:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/a/a/ai;->i:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    .line 977
    iget-object v0, p0, Lcom/a/a/ai;->c:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lcom/a/a/ai;->g:[Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 978
    :catch_0
    move-exception v0

    .line 979
    const-string v1, "PropertyValuesHolder"

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 980
    :catch_1
    move-exception v0

    .line 981
    const-string v1, "PropertyValuesHolder"

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 889
    invoke-virtual {p0}, Lcom/a/a/ai;->e()Lcom/a/a/ai;

    move-result-object v0

    return-object v0
.end method

.method d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 943
    iget v0, p0, Lcom/a/a/ai;->i:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/a/a/ai;
    .locals 2

    .prologue
    .line 948
    invoke-super {p0}, Lcom/a/a/ag;->a()Lcom/a/a/ag;

    move-result-object v0

    check-cast v0, Lcom/a/a/ai;

    .line 949
    iget-object v1, v0, Lcom/a/a/ai;->e:Lcom/a/a/p;

    check-cast v1, Lcom/a/a/l;

    iput-object v1, v0, Lcom/a/a/ai;->h:Lcom/a/a/l;

    .line 950
    return-object v0
.end method
