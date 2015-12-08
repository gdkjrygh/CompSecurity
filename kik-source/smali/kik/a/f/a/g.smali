.class public abstract Lkik/a/f/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/f/ac;


# instance fields
.field protected c:Ljava/lang/String;

.field protected volatile d:Z

.field protected volatile e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/f/a/g;->d:Z

    .line 26
    iput-object p1, p0, Lkik/a/f/a/g;->c:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method protected abstract a(Lkik/a/f/n;)V
.end method

.method public final a(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 32
    const-string v0, "stc"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 33
    const-string v0, "id"

    iget-object v1, p0, Lkik/a/f/a/g;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v0, "sts"

    iget-object v1, p0, Lkik/a/f/a/g;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string v0, "stc"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 36
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/f/a/g;->d:Z

    .line 41
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lkik/a/f/a/g;->c:Ljava/lang/String;

    return-object v0
.end method
