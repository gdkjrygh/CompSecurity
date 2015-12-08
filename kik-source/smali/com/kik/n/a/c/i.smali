.class public final Lcom/kik/n/a/c/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/c/i;

.field static final c:Lcom/b/a/u;


# instance fields
.field b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    new-instance v0, Lcom/kik/n/a/c/i;

    invoke-direct {v0}, Lcom/kik/n/a/c/i;-><init>()V

    sput-object v0, Lcom/kik/n/a/c/i;->a:Lcom/kik/n/a/c/i;

    .line 96
    new-instance v0, Lcom/kik/n/a/c/j;

    invoke-direct {v0}, Lcom/kik/n/a/c/j;-><init>()V

    sput-object v0, Lcom/kik/n/a/c/i;->c:Lcom/b/a/u;

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
    sget-object v0, Lcom/kik/n/a/c/i;->c:Lcom/b/a/u;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kik/n/a/c/i;->b:Ljava/util/List;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 81
    sget-object v0, Lcom/kik/n/a/c/i;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 82
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 86
    sget-object v0, Lcom/kik/n/a/c/i;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 87
    return-void
.end method
