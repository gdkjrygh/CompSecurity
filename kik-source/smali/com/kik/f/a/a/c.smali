.class public final Lcom/kik/f/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/f/a/a/c;

.field static final c:Lcom/b/a/u;


# instance fields
.field b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/kik/f/a/a/c;

    invoke-direct {v0}, Lcom/kik/f/a/a/c;-><init>()V

    sput-object v0, Lcom/kik/f/a/a/c;->a:Lcom/kik/f/a/a/c;

    .line 96
    new-instance v0, Lcom/kik/f/a/a/d;

    invoke-direct {v0}, Lcom/kik/f/a/a/d;-><init>()V

    sput-object v0, Lcom/kik/f/a/a/c;->c:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 93
    sget-object v0, Lcom/kik/f/a/a/c;->c:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(I)Lcom/kik/f/a/a/a;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    goto :goto_0
.end method

.method public final a(Lcom/kik/f/a/a/a;)Lcom/kik/f/a/a/c;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    if-nez v0, :cond_0

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    return-object p0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/f/a/a/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 81
    sget-object v0, Lcom/kik/f/a/a/c;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 82
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 86
    sget-object v0, Lcom/kik/f/a/a/c;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 87
    return-void
.end method
