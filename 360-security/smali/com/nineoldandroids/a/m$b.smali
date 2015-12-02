.class Lcom/nineoldandroids/a/m$b;
.super Lcom/nineoldandroids/a/m;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/a/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field h:Lcom/nineoldandroids/a/h;

.field i:I

.field private j:Lcom/nineoldandroids/util/b;


# direct methods
.method public varargs constructor <init>(Lcom/nineoldandroids/util/c;[I)V
    .locals 1

    .prologue
    .line 786
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/a/m;-><init>(Lcom/nineoldandroids/util/c;Lcom/nineoldandroids/a/m;)V

    .line 787
    invoke-virtual {p0, p2}, Lcom/nineoldandroids/a/m$b;->a([I)V

    .line 788
    instance-of v0, p1, Lcom/nineoldandroids/util/b;

    if-eqz v0, :cond_0

    .line 789
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->b:Lcom/nineoldandroids/util/c;

    check-cast v0, Lcom/nineoldandroids/util/b;

    iput-object v0, p0, Lcom/nineoldandroids/a/m$b;->j:Lcom/nineoldandroids/util/b;

    .line 791
    :cond_0
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[I)V
    .locals 1

    .prologue
    .line 781
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/a/m;-><init>(Ljava/lang/String;Lcom/nineoldandroids/a/m;)V

    .line 782
    invoke-virtual {p0, p2}, Lcom/nineoldandroids/a/m$b;->a([I)V

    .line 783
    return-void
.end method


# virtual methods
.method public synthetic a()Lcom/nineoldandroids/a/m;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/nineoldandroids/a/m$b;->e()Lcom/nineoldandroids/a/m$b;

    move-result-object v0

    return-object v0
.end method

.method a(F)V
    .locals 1

    .prologue
    .line 801
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->h:Lcom/nineoldandroids/a/h;

    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/h;->b(F)I

    move-result v0

    iput v0, p0, Lcom/nineoldandroids/a/m$b;->i:I

    .line 802
    return-void
.end method

.method a(Ljava/lang/Class;)V
    .locals 1

    .prologue
    .line 851
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->b:Lcom/nineoldandroids/util/c;

    if-eqz v0, :cond_0

    .line 885
    :goto_0
    return-void

    .line 883
    :cond_0
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/Class;)V

    goto :goto_0
.end method

.method public varargs a([I)V
    .locals 1

    .prologue
    .line 795
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/m;->a([I)V

    .line 796
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->e:Lcom/nineoldandroids/a/j;

    check-cast v0, Lcom/nineoldandroids/a/h;

    iput-object v0, p0, Lcom/nineoldandroids/a/m$b;->h:Lcom/nineoldandroids/a/h;

    .line 797
    return-void
.end method

.method b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 825
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->j:Lcom/nineoldandroids/util/b;

    if-eqz v0, :cond_1

    .line 826
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->j:Lcom/nineoldandroids/util/b;

    iget v1, p0, Lcom/nineoldandroids/a/m$b;->i:I

    invoke-virtual {v0, p1, v1}, Lcom/nineoldandroids/util/b;->a(Ljava/lang/Object;I)V

    .line 847
    :cond_0
    :goto_0
    return-void

    .line 829
    :cond_1
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->b:Lcom/nineoldandroids/util/c;

    if-eqz v0, :cond_2

    .line 830
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->b:Lcom/nineoldandroids/util/c;

    iget v1, p0, Lcom/nineoldandroids/a/m$b;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/nineoldandroids/util/c;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 837
    :cond_2
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    .line 839
    :try_start_0
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->g:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/nineoldandroids/a/m$b;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 840
    iget-object v0, p0, Lcom/nineoldandroids/a/m$b;->c:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lcom/nineoldandroids/a/m$b;->g:[Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 841
    :catch_0
    move-exception v0

    goto :goto_0

    .line 843
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 806
    iget v0, p0, Lcom/nineoldandroids/a/m$b;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/nineoldandroids/a/m$b;
    .locals 2

    .prologue
    .line 811
    invoke-super {p0}, Lcom/nineoldandroids/a/m;->a()Lcom/nineoldandroids/a/m;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/m$b;

    .line 812
    iget-object v1, v0, Lcom/nineoldandroids/a/m$b;->e:Lcom/nineoldandroids/a/j;

    check-cast v1, Lcom/nineoldandroids/a/h;

    iput-object v1, v0, Lcom/nineoldandroids/a/m$b;->h:Lcom/nineoldandroids/a/h;

    .line 813
    return-object v0
.end method
