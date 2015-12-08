.class public final Lcom/kik/n/a/b/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/b/g;

.field static final g:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/Long;

.field f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/kik/n/a/b/g;

    invoke-direct {v0}, Lcom/kik/n/a/b/g;-><init>()V

    sput-object v0, Lcom/kik/n/a/b/g;->a:Lcom/kik/n/a/b/g;

    .line 132
    new-instance v0, Lcom/kik/n/a/b/h;

    invoke-direct {v0}, Lcom/kik/n/a/b/h;-><init>()V

    sput-object v0, Lcom/kik/n/a/b/g;->g:Lcom/b/a/u;

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

.method public static b()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/kik/n/a/b/g;->g:Lcom/b/a/u;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 129
    sget-object v0, Lcom/kik/n/a/b/g;->g:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Ljava/lang/Long;)Lcom/kik/n/a/b/g;
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/kik/n/a/b/g;->e:Ljava/lang/Long;

    .line 97
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/n/a/b/g;
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/kik/n/a/b/g;->b:Ljava/lang/String;

    .line 58
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/n/a/b/g;
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/kik/n/a/b/g;->c:Ljava/lang/String;

    .line 71
    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/n/a/b/g;
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/kik/n/a/b/g;->d:Ljava/lang/String;

    .line 84
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/kik/n/a/b/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lcom/kik/n/a/b/g;
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/kik/n/a/b/g;->f:Ljava/lang/String;

    .line 110
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/kik/n/a/b/g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/kik/n/a/b/g;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/kik/n/a/b/g;->e:Ljava/lang/Long;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/kik/n/a/b/g;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 117
    sget-object v0, Lcom/kik/n/a/b/g;->g:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 118
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 122
    sget-object v0, Lcom/kik/n/a/b/g;->g:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 123
    return-void
.end method
