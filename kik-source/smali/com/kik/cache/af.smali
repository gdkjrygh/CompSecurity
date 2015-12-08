.class final Lcom/kik/cache/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/r$a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/kik/cache/ad;


# direct methods
.method constructor <init>(Lcom/kik/cache/ad;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 309
    iput-object p1, p0, Lcom/kik/cache/af;->c:Lcom/kik/cache/ad;

    iput-object p2, p0, Lcom/kik/cache/af;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cache/af;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/volley/w;)V
    .locals 3

    .prologue
    .line 313
    iget-object v0, p0, Lcom/kik/cache/af;->c:Lcom/kik/cache/ad;

    iget-object v1, p0, Lcom/kik/cache/af;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/kik/cache/af;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/ad;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/w;)V

    .line 314
    return-void
.end method
