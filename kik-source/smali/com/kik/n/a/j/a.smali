.class public final Lcom/kik/n/a/j/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/j/a;

.field static final d:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/kik/n/a/j/a;

    invoke-direct {v0}, Lcom/kik/n/a/j/a;-><init>()V

    sput-object v0, Lcom/kik/n/a/j/a;->a:Lcom/kik/n/a/j/a;

    .line 89
    new-instance v0, Lcom/kik/n/a/j/b;

    invoke-direct {v0}, Lcom/kik/n/a/j/b;-><init>()V

    sput-object v0, Lcom/kik/n/a/j/a;->d:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 86
    sget-object v0, Lcom/kik/n/a/j/a;->d:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/n/a/j/a;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/kik/n/a/j/a;->b:Ljava/lang/String;

    .line 54
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/n/a/j/a;
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/kik/n/a/j/a;->c:Ljava/lang/String;

    .line 67
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/kik/n/a/j/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/kik/n/a/j/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 74
    sget-object v0, Lcom/kik/n/a/j/a;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 75
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 79
    sget-object v0, Lcom/kik/n/a/j/a;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 80
    return-void
.end method
