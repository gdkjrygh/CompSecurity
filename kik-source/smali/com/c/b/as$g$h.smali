.class Lcom/c/b/as$g$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/as$g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# instance fields
.field protected final a:Ljava/lang/Class;

.field protected final b:Ljava/lang/reflect/Method;

.field protected final c:Ljava/lang/reflect/Method;

.field protected final d:Ljava/lang/reflect/Method;

.field protected final e:Ljava/lang/reflect/Method;

.field protected final f:Ljava/lang/reflect/Method;

.field protected final g:Ljava/lang/reflect/Method;

.field protected final h:Ljava/lang/reflect/Method;

.field protected final i:Ljava/lang/reflect/Method;

.field protected final j:Lcom/c/b/ak$f;

.field protected final k:Z

.field protected final l:Z


# direct methods
.method constructor <init>(Lcom/c/b/ak$f;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1986
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1987
    iput-object p1, p0, Lcom/c/b/as$g$h;->j:Lcom/c/b/ak$f;

    .line 1988
    invoke-virtual {p1}, Lcom/c/b/ak$f;->u()Lcom/c/b/ak$j;

    move-result-object v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/c/b/as$g$h;->k:Z

    .line 1989
    invoke-virtual {p1}, Lcom/c/b/ak$f;->d()Lcom/c/b/ak$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$g;->k()Lcom/c/b/ak$g$b;

    move-result-object v0

    sget-object v4, Lcom/c/b/ak$g$b;->b:Lcom/c/b/ak$g$b;

    if-ne v0, v4, :cond_3

    move v0, v1

    :goto_1
    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/c/b/as$g$h;->k:Z

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v4, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v4, :cond_4

    :cond_0
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/c/b/as$g$h;->l:Z

    .line 1991
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "get"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v4, v2, [Ljava/lang/Class;

    invoke-static {p3, v0, v4}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$h;->b:Ljava/lang/reflect/Method;

    .line 1992
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "get"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v4, v2, [Ljava/lang/Class;

    invoke-static {p4, v0, v4}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$h;->c:Ljava/lang/reflect/Method;

    .line 1993
    iget-object v0, p0, Lcom/c/b/as$g$h;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$h;->a:Ljava/lang/Class;

    .line 1994
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "set"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Class;

    iget-object v4, p0, Lcom/c/b/as$g$h;->a:Ljava/lang/Class;

    aput-object v4, v1, v2

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$h;->d:Ljava/lang/reflect/Method;

    .line 1995
    iget-boolean v0, p0, Lcom/c/b/as$g$h;->l:Z

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "has"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Class;

    invoke-static {p3, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    :goto_3
    iput-object v0, p0, Lcom/c/b/as$g$h;->e:Ljava/lang/reflect/Method;

    .line 1997
    iget-boolean v0, p0, Lcom/c/b/as$g$h;->l:Z

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "has"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Class;

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    :goto_4
    iput-object v0, p0, Lcom/c/b/as$g$h;->f:Ljava/lang/reflect/Method;

    .line 1999
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "clear"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Class;

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$g$h;->g:Ljava/lang/reflect/Method;

    .line 2000
    iget-boolean v0, p0, Lcom/c/b/as$g$h;->k:Z

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "get"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Case"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Class;

    invoke-static {p3, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    :goto_5
    iput-object v0, p0, Lcom/c/b/as$g$h;->h:Ljava/lang/reflect/Method;

    .line 2002
    iget-boolean v0, p0, Lcom/c/b/as$g$h;->k:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "get"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Case"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Class;

    invoke-static {p4, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    :cond_1
    iput-object v3, p0, Lcom/c/b/as$g$h;->i:Ljava/lang/reflect/Method;

    .line 2004
    return-void

    :cond_2
    move v0, v2

    .line 1988
    goto/16 :goto_0

    :cond_3
    move v0, v2

    .line 1989
    goto/16 :goto_1

    :cond_4
    move v0, v2

    goto/16 :goto_2

    :cond_5
    move-object v0, v3

    .line 1995
    goto/16 :goto_3

    :cond_6
    move-object v0, v3

    .line 1997
    goto :goto_4

    :cond_7
    move-object v0, v3

    .line 2000
    goto :goto_5
.end method


# virtual methods
.method public a()Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 2103
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "newBuilderForField() called on a non-Message type."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/c/b/as$a;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 2034
    iget-object v0, p0, Lcom/c/b/as$g$h;->c:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/c/b/as;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 2031
    iget-object v0, p0, Lcom/c/b/as$g$h;->b:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/c/b/as$a;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 2043
    iget-object v0, p0, Lcom/c/b/as$g$h;->d:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2044
    return-void
.end method

.method public b(Lcom/c/b/as;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2037
    invoke-virtual {p0, p1}, Lcom/c/b/as$g$h;->a(Lcom/c/b/as;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/c/b/as$a;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 2070
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "addRepeatedField() called on a singular field."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lcom/c/b/as$a;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2083
    iget-boolean v0, p0, Lcom/c/b/as$g$h;->l:Z

    if-nez v0, :cond_3

    .line 2084
    iget-boolean v0, p0, Lcom/c/b/as$g$h;->k:Z

    if-eqz v0, :cond_1

    .line 2085
    iget-object v0, p0, Lcom/c/b/as$g$h;->i:Ljava/lang/reflect/Method;

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, p1, v3}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/au$a;

    invoke-interface {v0}, Lcom/c/b/au$a;->a()I

    move-result v0

    iget-object v3, p0, Lcom/c/b/as$g$h;->j:Lcom/c/b/ak$f;

    invoke-virtual {v3}, Lcom/c/b/ak$f;->e()I

    move-result v3

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 2089
    :goto_0
    return v0

    :cond_0
    move v0, v2

    .line 2085
    goto :goto_0

    .line 2087
    :cond_1
    invoke-virtual {p0, p1}, Lcom/c/b/as$g$h;->a(Lcom/c/b/as$a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, Lcom/c/b/as$g$h;->j:Lcom/c/b/ak$f;

    invoke-virtual {v3}, Lcom/c/b/ak$f;->r()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_0

    .line 2089
    :cond_3
    iget-object v0, p0, Lcom/c/b/as$g$h;->f:Ljava/lang/reflect/Method;

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method public final c(Lcom/c/b/as;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2074
    iget-boolean v0, p0, Lcom/c/b/as$g$h;->l:Z

    if-nez v0, :cond_3

    .line 2075
    iget-boolean v0, p0, Lcom/c/b/as$g$h;->k:Z

    if-eqz v0, :cond_1

    .line 2076
    iget-object v0, p0, Lcom/c/b/as$g$h;->h:Ljava/lang/reflect/Method;

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, p1, v3}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/au$a;

    invoke-interface {v0}, Lcom/c/b/au$a;->a()I

    move-result v0

    iget-object v3, p0, Lcom/c/b/as$g$h;->j:Lcom/c/b/ak$f;

    invoke-virtual {v3}, Lcom/c/b/ak$f;->e()I

    move-result v3

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 2080
    :goto_0
    return v0

    :cond_0
    move v0, v2

    .line 2076
    goto :goto_0

    .line 2078
    :cond_1
    invoke-virtual {p0, p1}, Lcom/c/b/as$g$h;->a(Lcom/c/b/as;)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, Lcom/c/b/as$g$h;->j:Lcom/c/b/ak$f;

    invoke-virtual {v3}, Lcom/c/b/ak$f;->r()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_0

    .line 2080
    :cond_3
    iget-object v0, p0, Lcom/c/b/as$g$h;->e:Ljava/lang/reflect/Method;

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/c/b/as;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method
