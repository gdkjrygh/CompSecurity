.class public final Lcom/b/a/f;
.super Lcom/b/a/d;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/i;
.implements Lcom/b/a/u;


# static fields
.field static final synthetic b:Z


# instance fields
.field private final c:Ljava/util/ArrayList;

.field private d:I

.field private e:Lcom/b/a/u;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/b/a/f;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/b/a/f;->b:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/b/a/a;)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/b/a/d;-><init>(Lcom/b/a/k;)V

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lcom/b/a/f;->d:I

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/b/a/f;->f:Z

    .line 44
    sget-boolean v0, Lcom/b/a/f;->b:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Lcom/b/a/a;->a:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 46
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/b/a/f;->c:Ljava/util/ArrayList;

    .line 47
    return-void
.end method


# virtual methods
.method public final a(Lcom/b/a/u;)I
    .locals 3

    .prologue
    .line 76
    iget-object v0, p0, Lcom/b/a/f;->a:Lcom/b/a/k;

    check-cast v0, Lcom/b/a/a;

    invoke-virtual {v0, p1}, Lcom/b/a/a;->a(Lcom/b/a/u;)I

    move-result v1

    .line 77
    iget-object v0, p0, Lcom/b/a/f;->a:Lcom/b/a/k;

    check-cast v0, Lcom/b/a/a;

    invoke-virtual {v0}, Lcom/b/a/a;->a()I

    move-result v0

    invoke-static {v0}, Lcom/b/a/y;->a(I)I

    move-result v0

    const/4 v2, 0x6

    if-ne v0, v2, :cond_0

    .line 80
    iget-object v0, p0, Lcom/b/a/f;->a:Lcom/b/a/k;

    check-cast v0, Lcom/b/a/a;

    invoke-virtual {v0}, Lcom/b/a/a;->e()I

    move-result v0

    iput v0, p0, Lcom/b/a/f;->d:I

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/b/a/f;->f:Z

    .line 89
    :goto_0
    return v1

    .line 86
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/b/a/f;->f:Z

    goto :goto_0
.end method

.method public final a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 140
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 95
    iget-boolean v0, p0, Lcom/b/a/f;->f:Z

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/b/a/f;->c:Ljava/util/ArrayList;

    iget v1, p0, Lcom/b/a/f;->d:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    .line 110
    :goto_0
    return-object p1

    .line 101
    :cond_0
    iput-object p2, p0, Lcom/b/a/f;->e:Lcom/b/a/u;

    .line 103
    if-nez p1, :cond_1

    .line 104
    invoke-interface {p2}, Lcom/b/a/u;->a()Ljava/lang/Object;

    move-result-object p1

    .line 106
    :cond_1
    iget-object v0, p0, Lcom/b/a/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    iget-object v0, p0, Lcom/b/a/f;->a:Lcom/b/a/k;

    check-cast v0, Lcom/b/a/a;

    invoke-virtual {v0, p1, p0}, Lcom/b/a/a;->a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final a(Lcom/b/a/k;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 150
    iget-object v0, p0, Lcom/b/a/f;->e:Lcom/b/a/u;

    .line 153
    invoke-interface {v0, p0, p2}, Lcom/b/a/u;->a(Lcom/b/a/k;Ljava/lang/Object;)V

    .line 154
    invoke-interface {v0, p2}, Lcom/b/a/u;->a(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 155
    new-instance v1, Lcom/b/a/x;

    invoke-direct {v1, p2, v0}, Lcom/b/a/x;-><init>(Ljava/lang/Object;Lcom/b/a/u;)V

    throw v1

    .line 158
    :cond_0
    iput-object v0, p0, Lcom/b/a/f;->e:Lcom/b/a/u;

    .line 159
    return-void
.end method

.method public final a(Lcom/b/a/o;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 164
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 125
    const/4 v0, 0x1

    return v0
.end method
