.class public final Lcom/kik/n/a/c/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/c/e;

.field static final o:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:Ljava/lang/Long;

.field j:Ljava/lang/Long;

.field k:Lcom/kik/n/a/c/a;

.field l:Ljava/util/List;

.field m:Ljava/lang/String;

.field n:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/kik/n/a/c/e;

    invoke-direct {v0}, Lcom/kik/n/a/c/e;-><init>()V

    sput-object v0, Lcom/kik/n/a/c/e;->a:Lcom/kik/n/a/c/e;

    .line 281
    new-instance v0, Lcom/kik/n/a/c/f;

    invoke-direct {v0}, Lcom/kik/n/a/c/f;-><init>()V

    sput-object v0, Lcom/kik/n/a/c/e;->o:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 278
    sget-object v0, Lcom/kik/n/a/c/e;->o:Lcom/b/a/u;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/kik/n/a/c/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/kik/n/a/c/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/kik/n/a/c/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/kik/n/a/c/e;->j:Ljava/lang/Long;

    return-object v0
.end method

.method public final f()Lcom/kik/n/a/c/a;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/kik/n/a/c/e;->k:Lcom/kik/n/a/c/a;

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/kik/n/a/c/e;->l:Ljava/util/List;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/kik/n/a/c/e;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 266
    sget-object v0, Lcom/kik/n/a/c/e;->o:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 267
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 271
    sget-object v0, Lcom/kik/n/a/c/e;->o:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 272
    return-void
.end method
