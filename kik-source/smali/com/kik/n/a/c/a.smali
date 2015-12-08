.class public final Lcom/kik/n/a/c/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/c/a;

.field static final d:Lcom/b/a/u;


# instance fields
.field b:Lcom/b/a/b;

.field c:Lcom/b/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/kik/n/a/c/a;

    invoke-direct {v0}, Lcom/kik/n/a/c/a;-><init>()V

    sput-object v0, Lcom/kik/n/a/c/a;->a:Lcom/kik/n/a/c/a;

    .line 90
    new-instance v0, Lcom/kik/n/a/c/b;

    invoke-direct {v0}, Lcom/kik/n/a/c/b;-><init>()V

    sput-object v0, Lcom/kik/n/a/c/a;->d:Lcom/b/a/u;

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

.method public static b()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/kik/n/a/c/a;->d:Lcom/b/a/u;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 87
    sget-object v0, Lcom/kik/n/a/c/a;->d:Lcom/b/a/u;

    return-object v0
.end method

.method public final c()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/kik/n/a/c/a;->b:Lcom/b/a/b;

    return-object v0
.end method

.method public final d()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/kik/n/a/c/a;->c:Lcom/b/a/b;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 75
    sget-object v0, Lcom/kik/n/a/c/a;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 76
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 80
    sget-object v0, Lcom/kik/n/a/c/a;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 81
    return-void
.end method
