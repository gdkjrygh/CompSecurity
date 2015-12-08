.class public final Lcom/kik/n/a/b/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/b/c;

.field static final e:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/util/List;

.field d:Lcom/kik/n/a/b/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/kik/n/a/b/c;

    invoke-direct {v0}, Lcom/kik/n/a/b/c;-><init>()V

    sput-object v0, Lcom/kik/n/a/b/c;->a:Lcom/kik/n/a/b/c;

    .line 124
    new-instance v0, Lcom/kik/n/a/b/d;

    invoke-direct {v0}, Lcom/kik/n/a/b/d;-><init>()V

    sput-object v0, Lcom/kik/n/a/b/c;->e:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 121
    sget-object v0, Lcom/kik/n/a/b/c;->e:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Lcom/kik/n/a/b/a;)Lcom/kik/n/a/b/c;
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/kik/n/a/b/c;->d:Lcom/kik/n/a/b/a;

    .line 102
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/n/a/b/c;
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/kik/n/a/b/c;->b:Ljava/lang/String;

    .line 58
    return-object p0
.end method

.method public final a(Ljava/util/List;)Lcom/kik/n/a/b/c;
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/kik/n/a/b/c;->c:Ljava/util/List;

    .line 71
    return-object p0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/kik/n/a/b/c;->c:Ljava/util/List;

    return-object v0
.end method

.method public final c()Lcom/kik/n/a/b/a;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/kik/n/a/b/c;->d:Lcom/kik/n/a/b/a;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 109
    sget-object v0, Lcom/kik/n/a/b/c;->e:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 110
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 114
    sget-object v0, Lcom/kik/n/a/b/c;->e:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 115
    return-void
.end method
