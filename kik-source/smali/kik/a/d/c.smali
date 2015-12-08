.class public final Lkik/a/d/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lkik/a/d/c;->a:Z

    .line 22
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    .prologue
    .line 31
    iput-boolean p1, p0, Lkik/a/d/c;->a:Z

    .line 32
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lkik/a/d/c;->a:Z

    return v0
.end method

.method public final b()Lcom/kik/n/a/a/a;
    .locals 2

    .prologue
    .line 36
    new-instance v0, Lcom/kik/n/a/a/a;

    invoke-direct {v0}, Lcom/kik/n/a/a/a;-><init>()V

    .line 37
    iget-boolean v1, p0, Lkik/a/d/c;->a:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/n/a/a/a;->a(Ljava/lang/Boolean;)Lcom/kik/n/a/a/a;

    .line 38
    return-object v0
.end method
