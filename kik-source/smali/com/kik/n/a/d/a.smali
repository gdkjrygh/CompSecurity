.class public final Lcom/kik/n/a/d/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/d/a;

.field static final c:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/kik/n/a/d/a;

    invoke-direct {v0}, Lcom/kik/n/a/d/a;-><init>()V

    sput-object v0, Lcom/kik/n/a/d/a;->a:Lcom/kik/n/a/d/a;

    .line 75
    new-instance v0, Lcom/kik/n/a/d/b;

    invoke-direct {v0}, Lcom/kik/n/a/d/b;-><init>()V

    sput-object v0, Lcom/kik/n/a/d/a;->c:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 72
    sget-object v0, Lcom/kik/n/a/d/a;->c:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/n/a/d/a;
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/kik/n/a/d/a;->b:Ljava/lang/String;

    .line 53
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/kik/n/a/d/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 60
    sget-object v0, Lcom/kik/n/a/d/a;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 61
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 65
    sget-object v0, Lcom/kik/n/a/d/a;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 66
    return-void
.end method
