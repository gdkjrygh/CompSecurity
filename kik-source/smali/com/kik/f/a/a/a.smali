.class public final Lcom/kik/f/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/f/a/a/a;

.field static final i:Lcom/b/a/u;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/kik/f/a/a/a;

    invoke-direct {v0}, Lcom/kik/f/a/a/a;-><init>()V

    sput-object v0, Lcom/kik/f/a/a/a;->a:Lcom/kik/f/a/a/a;

    .line 170
    new-instance v0, Lcom/kik/f/a/a/b;

    invoke-direct {v0}, Lcom/kik/f/a/a/b;-><init>()V

    sput-object v0, Lcom/kik/f/a/a/a;->i:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/kik/f/a/a/a;->e:Ljava/lang/String;

    .line 55
    iput-object p2, p0, Lcom/kik/f/a/a/a;->g:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public static b()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/kik/f/a/a/a;->i:Lcom/b/a/u;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 167
    sget-object v0, Lcom/kik/f/a/a/a;->i:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/f/a/a/a;
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/kik/f/a/a/a;->b:Ljava/lang/String;

    .line 70
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/f/a/a/a;
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/kik/f/a/a/a;->c:Ljava/lang/String;

    .line 83
    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/f/a/a/a;
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/kik/f/a/a/a;->d:Ljava/lang/String;

    .line 96
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/kik/f/a/a/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lcom/kik/f/a/a/a;
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lcom/kik/f/a/a/a;->f:Ljava/lang/String;

    .line 122
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/kik/f/a/a/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e(Ljava/lang/String;)Lcom/kik/f/a/a/a;
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lcom/kik/f/a/a/a;->h:Ljava/lang/String;

    .line 148
    return-object p0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/kik/f/a/a/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/kik/f/a/a/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/kik/f/a/a/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/kik/f/a/a/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/f/a/a/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 155
    sget-object v0, Lcom/kik/f/a/a/a;->i:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 156
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 160
    sget-object v0, Lcom/kik/f/a/a/a;->i:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 161
    return-void
.end method
