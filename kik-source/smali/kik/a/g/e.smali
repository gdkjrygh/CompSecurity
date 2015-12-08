.class final Lkik/a/g/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;)V
    .locals 0

    .prologue
    .line 544
    iput-object p1, p0, Lkik/a/g/e;->a:Lkik/a/g/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 544
    check-cast p1, Lkik/a/f/f/l;

    iget-object v0, p0, Lkik/a/g/e;->a:Lkik/a/g/b;

    invoke-virtual {p1}, Lkik/a/f/f/l;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/a/g/b;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    return-object v0
.end method
