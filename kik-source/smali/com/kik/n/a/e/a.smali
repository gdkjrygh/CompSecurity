.class public final Lcom/kik/n/a/e/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/e/a;

.field static final f:Lcom/b/a/u;


# instance fields
.field b:Lcom/b/a/b;

.field c:Lcom/b/a/b;

.field d:Lcom/b/a/b;

.field e:Lcom/b/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/kik/n/a/e/a;

    invoke-direct {v0}, Lcom/kik/n/a/e/a;-><init>()V

    sput-object v0, Lcom/kik/n/a/e/a;->a:Lcom/kik/n/a/e/a;

    .line 118
    new-instance v0, Lcom/kik/n/a/e/b;

    invoke-direct {v0}, Lcom/kik/n/a/e/b;-><init>()V

    sput-object v0, Lcom/kik/n/a/e/a;->f:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kik/n/a/e/a;->f:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Lcom/b/a/b;)Lcom/kik/n/a/e/a;
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/kik/n/a/e/a;->b:Lcom/b/a/b;

    .line 57
    return-object p0
.end method

.method public final b()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/kik/n/a/e/a;->b:Lcom/b/a/b;

    return-object v0
.end method

.method public final b(Lcom/b/a/b;)Lcom/kik/n/a/e/a;
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/kik/n/a/e/a;->c:Lcom/b/a/b;

    .line 70
    return-object p0
.end method

.method public final c()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/kik/n/a/e/a;->c:Lcom/b/a/b;

    return-object v0
.end method

.method public final c(Lcom/b/a/b;)Lcom/kik/n/a/e/a;
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/kik/n/a/e/a;->d:Lcom/b/a/b;

    .line 83
    return-object p0
.end method

.method public final d()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/kik/n/a/e/a;->d:Lcom/b/a/b;

    return-object v0
.end method

.method public final d(Lcom/b/a/b;)Lcom/kik/n/a/e/a;
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/kik/n/a/e/a;->e:Lcom/b/a/b;

    .line 96
    return-object p0
.end method

.method public final e()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/kik/n/a/e/a;->e:Lcom/b/a/b;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 103
    sget-object v0, Lcom/kik/n/a/e/a;->f:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 104
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 108
    sget-object v0, Lcom/kik/n/a/e/a;->f:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 109
    return-void
.end method
