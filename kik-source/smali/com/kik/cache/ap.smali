.class public final Lcom/kik/cache/ap;
.super Lcom/android/volley/p;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/android/volley/b;I)V
    .locals 2

    .prologue
    .line 20
    new-instance v0, Lcom/android/volley/toolbox/a;

    new-instance v1, Lcom/kik/cache/ao;

    invoke-direct {v1}, Lcom/kik/cache/ao;-><init>()V

    invoke-direct {v0, v1}, Lcom/android/volley/toolbox/a;-><init>(Lcom/android/volley/toolbox/g;)V

    invoke-direct {p0, p1, v0, p2}, Lcom/android/volley/p;-><init>(Lcom/android/volley/b;Lcom/android/volley/h;I)V

    .line 21
    return-void
.end method
