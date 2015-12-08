.class final Lkik/a/g/ak;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 1419
    iput-object p1, p0, Lkik/a/g/ak;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 1419
    check-cast p2, Lkik/a/d/s;

    iget-object v0, p0, Lkik/a/g/ak;->a:Lkik/a/g/v;

    invoke-virtual {p2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lkik/a/g/v;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    return-void
.end method
