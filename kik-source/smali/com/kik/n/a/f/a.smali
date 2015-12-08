.class public final Lcom/kik/n/a/f/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/f/a;

.field static final e:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/kik/n/a/f/a;

    invoke-direct {v0}, Lcom/kik/n/a/f/a;-><init>()V

    sput-object v0, Lcom/kik/n/a/f/a;->a:Lcom/kik/n/a/f/a;

    .line 103
    new-instance v0, Lcom/kik/n/a/f/b;

    invoke-direct {v0}, Lcom/kik/n/a/f/b;-><init>()V

    sput-object v0, Lcom/kik/n/a/f/a;->e:Lcom/b/a/u;

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
    .line 22
    sget-object v0, Lcom/kik/n/a/f/a;->e:Lcom/b/a/u;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 100
    sget-object v0, Lcom/kik/n/a/f/a;->e:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/n/a/f/a;
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/kik/n/a/f/a;->b:Ljava/lang/String;

    .line 55
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/n/a/f/a;
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/kik/n/a/f/a;->c:Ljava/lang/String;

    .line 68
    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/n/a/f/a;
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/kik/n/a/f/a;->d:Ljava/lang/String;

    .line 81
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/kik/n/a/f/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/kik/n/a/f/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/kik/n/a/f/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lcom/kik/n/a/f/a;->e:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 89
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 93
    sget-object v0, Lcom/kik/n/a/f/a;->e:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 94
    return-void
.end method
