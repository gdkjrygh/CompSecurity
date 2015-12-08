.class public final Lcom/kik/n/a/b/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/b/a;

.field static final d:Lcom/b/a/u;


# instance fields
.field b:Lcom/b/a/b;

.field c:Lcom/b/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/kik/n/a/b/a;

    invoke-direct {v0}, Lcom/kik/n/a/b/a;-><init>()V

    sput-object v0, Lcom/kik/n/a/b/a;->a:Lcom/kik/n/a/b/a;

    .line 91
    new-instance v0, Lcom/kik/n/a/b/b;

    invoke-direct {v0}, Lcom/kik/n/a/b/b;-><init>()V

    sput-object v0, Lcom/kik/n/a/b/a;->d:Lcom/b/a/u;

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

.method public static b()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/kik/n/a/b/a;->d:Lcom/b/a/u;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lcom/kik/n/a/b/a;->d:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Lcom/b/a/b;)Lcom/kik/n/a/b/a;
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/kik/n/a/b/a;->b:Lcom/b/a/b;

    .line 56
    return-object p0
.end method

.method public final b(Lcom/b/a/b;)Lcom/kik/n/a/b/a;
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/kik/n/a/b/a;->c:Lcom/b/a/b;

    .line 69
    return-object p0
.end method

.method public final c()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kik/n/a/b/a;->b:Lcom/b/a/b;

    return-object v0
.end method

.method public final d()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/kik/n/a/b/a;->c:Lcom/b/a/b;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 76
    sget-object v0, Lcom/kik/n/a/b/a;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 77
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 81
    sget-object v0, Lcom/kik/n/a/b/a;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 82
    return-void
.end method
