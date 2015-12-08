.class public final Lcom/kik/n/a/j/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/j/c;

.field static final g:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/kik/n/a/j/c;

    invoke-direct {v0}, Lcom/kik/n/a/j/c;-><init>()V

    sput-object v0, Lcom/kik/n/a/j/c;->a:Lcom/kik/n/a/j/c;

    .line 131
    new-instance v0, Lcom/kik/n/a/j/d;

    invoke-direct {v0}, Lcom/kik/n/a/j/d;-><init>()V

    sput-object v0, Lcom/kik/n/a/j/c;->g:Lcom/b/a/u;

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
    .line 128
    sget-object v0, Lcom/kik/n/a/j/c;->g:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Ljava/lang/Long;)Lcom/kik/n/a/j/c;
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/kik/n/a/j/c;->f:Ljava/lang/Long;

    .line 109
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/n/a/j/c;
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/kik/n/a/j/c;->b:Ljava/lang/String;

    .line 57
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/n/a/j/c;
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/kik/n/a/j/c;->c:Ljava/lang/String;

    .line 70
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/kik/n/a/j/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/n/a/j/c;
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/kik/n/a/j/c;->d:Ljava/lang/String;

    .line 83
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/kik/n/a/j/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lcom/kik/n/a/j/c;
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/kik/n/a/j/c;->e:Ljava/lang/String;

    .line 96
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/kik/n/a/j/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/kik/n/a/j/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/kik/n/a/j/c;->f:Ljava/lang/Long;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 116
    sget-object v0, Lcom/kik/n/a/j/c;->g:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 117
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 121
    sget-object v0, Lcom/kik/n/a/j/c;->g:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 122
    return-void
.end method
