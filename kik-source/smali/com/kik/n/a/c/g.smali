.class public final Lcom/kik/n/a/c/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/n/a/c/g$a;,
        Lcom/kik/n/a/c/g$b;
    }
.end annotation


# static fields
.field static final a:Lcom/kik/n/a/c/g;

.field static final d:Lcom/b/a/u;


# instance fields
.field b:Lcom/kik/n/a/c/g$a;

.field c:Lcom/kik/n/a/c/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 94
    new-instance v0, Lcom/kik/n/a/c/g;

    invoke-direct {v0}, Lcom/kik/n/a/c/g;-><init>()V

    sput-object v0, Lcom/kik/n/a/c/g;->a:Lcom/kik/n/a/c/g;

    .line 153
    new-instance v0, Lcom/kik/n/a/c/h;

    invoke-direct {v0}, Lcom/kik/n/a/c/h;-><init>()V

    sput-object v0, Lcom/kik/n/a/c/g;->d:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    return-void
.end method

.method public static b()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 86
    sget-object v0, Lcom/kik/n/a/c/g;->d:Lcom/b/a/u;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 150
    sget-object v0, Lcom/kik/n/a/c/g;->d:Lcom/b/a/u;

    return-object v0
.end method

.method public final c()Lcom/kik/n/a/c/g$a;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/kik/n/a/c/g;->b:Lcom/kik/n/a/c/g$a;

    if-nez v0, :cond_0

    sget-object v0, Lcom/kik/n/a/c/g$a;->a:Lcom/kik/n/a/c/g$a;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/kik/n/a/c/g;->b:Lcom/kik/n/a/c/g$a;

    goto :goto_0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 138
    sget-object v0, Lcom/kik/n/a/c/g;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 139
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 143
    sget-object v0, Lcom/kik/n/a/c/g;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 144
    return-void
.end method
