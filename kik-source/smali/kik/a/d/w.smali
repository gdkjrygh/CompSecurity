.class public final Lkik/a/d/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/kik/n/a/f/a;)V
    .locals 3

    .prologue
    .line 13
    invoke-virtual {p1}, Lcom/kik/n/a/f/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/kik/n/a/f/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/kik/n/a/f/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lkik/a/d/w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lkik/a/d/w;->a:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lkik/a/d/w;->b:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lkik/a/d/w;->c:Ljava/lang/String;

    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lkik/a/d/w;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lkik/a/d/w;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lkik/a/d/w;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/kik/n/a/f/a;
    .locals 2

    .prologue
    .line 40
    new-instance v0, Lcom/kik/n/a/f/a;

    invoke-direct {v0}, Lcom/kik/n/a/f/a;-><init>()V

    .line 42
    iget-object v1, p0, Lkik/a/d/w;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/f/a;->c(Ljava/lang/String;)Lcom/kik/n/a/f/a;

    .line 43
    iget-object v1, p0, Lkik/a/d/w;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/f/a;->b(Ljava/lang/String;)Lcom/kik/n/a/f/a;

    .line 44
    iget-object v1, p0, Lkik/a/d/w;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/f/a;->a(Ljava/lang/String;)Lcom/kik/n/a/f/a;

    .line 46
    return-object v0
.end method
