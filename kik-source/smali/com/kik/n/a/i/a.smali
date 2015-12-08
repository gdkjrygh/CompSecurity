.class public final Lcom/kik/n/a/i/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/i/a;

.field static final c:Lcom/b/a/u;


# instance fields
.field b:Lcom/b/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/kik/n/a/i/a;

    invoke-direct {v0}, Lcom/kik/n/a/i/a;-><init>()V

    sput-object v0, Lcom/kik/n/a/i/a;->a:Lcom/kik/n/a/i/a;

    .line 77
    new-instance v0, Lcom/kik/n/a/i/b;

    invoke-direct {v0}, Lcom/kik/n/a/i/b;-><init>()V

    sput-object v0, Lcom/kik/n/a/i/a;->c:Lcom/b/a/u;

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
    .line 74
    sget-object v0, Lcom/kik/n/a/i/a;->c:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Lcom/b/a/b;)Lcom/kik/n/a/i/a;
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/kik/n/a/i/a;->b:Lcom/b/a/b;

    .line 55
    return-object p0
.end method

.method public final b()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/kik/n/a/i/a;->b:Lcom/b/a/b;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/kik/n/a/i/a;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 63
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 67
    sget-object v0, Lcom/kik/n/a/i/a;->c:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 68
    return-void
.end method
