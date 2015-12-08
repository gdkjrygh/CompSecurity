.class public final Lcom/kik/i/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/i/a/a/c;

.field static final c:Lcom/b/a/u;


# instance fields
.field b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/kik/i/a/a/c;

    invoke-direct {v0}, Lcom/kik/i/a/a/c;-><init>()V

    sput-object v0, Lcom/kik/i/a/a/c;->a:Lcom/kik/i/a/a/c;

    .line 95
    new-instance v0, Lcom/kik/i/a/a/d;

    invoke-direct {v0}, Lcom/kik/i/a/a/d;-><init>()V

    sput-object v0, Lcom/kik/i/a/a/c;->c:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 92
    sget-object v0, Lcom/kik/i/a/a/c;->c:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Lcom/kik/i/a/a/a;)Lcom/kik/i/a/a/c;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/kik/i/a/a/c;->b:Ljava/util/List;

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/i/a/a/c;->b:Ljava/util/List;

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/kik/i/a/a/c;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    return-object p0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/kik/i/a/a/c;->b:Ljava/util/List;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 80
    sget-object v0, Lcom/kik/i/a/a/c;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 81
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 85
    sget-object v0, Lcom/kik/i/a/a/c;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 86
    return-void
.end method
