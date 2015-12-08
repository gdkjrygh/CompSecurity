.class public final Lcom/kik/i/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/i/a/a/a;

.field static final f:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/Integer;

.field c:Ljava/lang/Integer;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/kik/i/a/a/a;

    invoke-direct {v0}, Lcom/kik/i/a/a/a;-><init>()V

    sput-object v0, Lcom/kik/i/a/a/a;->a:Lcom/kik/i/a/a/a;

    .line 117
    new-instance v0, Lcom/kik/i/a/a/b;

    invoke-direct {v0}, Lcom/kik/i/a/a/b;-><init>()V

    sput-object v0, Lcom/kik/i/a/a/a;->f:Lcom/b/a/u;

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
    .line 22
    sget-object v0, Lcom/kik/i/a/a/a;->f:Lcom/b/a/u;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 114
    sget-object v0, Lcom/kik/i/a/a/a;->f:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Ljava/lang/Integer;)Lcom/kik/i/a/a/a;
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/kik/i/a/a/a;->b:Ljava/lang/Integer;

    .line 56
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/i/a/a/a;
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lcom/kik/i/a/a/a;->d:Ljava/lang/String;

    .line 82
    return-object p0
.end method

.method public final b(Ljava/lang/Integer;)Lcom/kik/i/a/a/a;
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/kik/i/a/a/a;->c:Ljava/lang/Integer;

    .line 69
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/i/a/a/a;
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/kik/i/a/a/a;->e:Ljava/lang/String;

    .line 95
    return-object p0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/kik/i/a/a/a;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/kik/i/a/a/a;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/kik/i/a/a/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/kik/i/a/a/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 102
    sget-object v0, Lcom/kik/i/a/a/a;->f:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 103
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 107
    sget-object v0, Lcom/kik/i/a/a/a;->f:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 108
    return-void
.end method
