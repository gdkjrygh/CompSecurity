.class final Lcom/android/volley/toolbox/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/android/volley/toolbox/i$c;

.field final synthetic b:Lcom/android/volley/toolbox/q;


# direct methods
.method constructor <init>(Lcom/android/volley/toolbox/q;Lcom/android/volley/toolbox/i$c;)V
    .locals 0

    .prologue
    .line 179
    iput-object p1, p0, Lcom/android/volley/toolbox/r;->b:Lcom/android/volley/toolbox/q;

    iput-object p2, p0, Lcom/android/volley/toolbox/r;->a:Lcom/android/volley/toolbox/i$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 183
    iget-object v0, p0, Lcom/android/volley/toolbox/r;->b:Lcom/android/volley/toolbox/q;

    iget-object v1, p0, Lcom/android/volley/toolbox/r;->a:Lcom/android/volley/toolbox/i$c;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/android/volley/toolbox/q;->a(Lcom/android/volley/toolbox/i$c;Z)V

    .line 184
    return-void
.end method
