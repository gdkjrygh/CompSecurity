.class Lcom/android/volley/toolbox/g$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;Lcom/android/volley/toolbox/g$d;II)Lcom/android/volley/toolbox/g$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/volley/k$a;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/android/volley/toolbox/g;

.field private final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/android/volley/toolbox/g;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/android/volley/toolbox/g$2;->a:Lcom/android/volley/toolbox/g;

    iput-object p2, p0, Lcom/android/volley/toolbox/g$2;->b:Ljava/lang/String;

    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/VolleyError;)V
    .locals 2

    .prologue
    .line 242
    iget-object v0, p0, Lcom/android/volley/toolbox/g$2;->a:Lcom/android/volley/toolbox/g;

    iget-object v1, p0, Lcom/android/volley/toolbox/g$2;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/android/volley/toolbox/g;->a(Lcom/android/volley/toolbox/g;Ljava/lang/String;Lcom/android/volley/VolleyError;)V

    .line 243
    return-void
.end method
