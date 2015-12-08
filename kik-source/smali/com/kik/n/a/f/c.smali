.class public final Lcom/kik/n/a/f/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/f/c;

.field static final f:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/kik/n/a/f/c;

    invoke-direct {v0}, Lcom/kik/n/a/f/c;-><init>()V

    sput-object v0, Lcom/kik/n/a/f/c;->a:Lcom/kik/n/a/f/c;

    .line 137
    new-instance v0, Lcom/kik/n/a/f/d;

    invoke-direct {v0}, Lcom/kik/n/a/f/d;-><init>()V

    sput-object v0, Lcom/kik/n/a/f/c;->f:Lcom/b/a/u;

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
    .line 134
    sget-object v0, Lcom/kik/n/a/f/c;->f:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/n/a/f/c;
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/kik/n/a/f/c;->b:Ljava/lang/String;

    .line 58
    return-object p0
.end method

.method public final a(Ljava/util/List;)Lcom/kik/n/a/f/c;
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/kik/n/a/f/c;->e:Ljava/util/List;

    .line 97
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/n/a/f/c;
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/kik/n/a/f/c;->c:Ljava/lang/String;

    .line 71
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/kik/n/a/f/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/n/a/f/c;
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/kik/n/a/f/c;->d:Ljava/lang/String;

    .line 84
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/kik/n/a/f/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/kik/n/a/f/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/kik/n/a/f/c;->e:Ljava/util/List;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 122
    sget-object v0, Lcom/kik/n/a/f/c;->f:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 123
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 127
    sget-object v0, Lcom/kik/n/a/f/c;->f:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 128
    return-void
.end method
