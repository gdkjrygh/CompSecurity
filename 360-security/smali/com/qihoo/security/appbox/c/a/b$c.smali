.class Lcom/qihoo/security/appbox/c/a/b$c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/appbox/c/a/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/c/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final a:Lcom/android/volley/toolbox/g$c;


# direct methods
.method public constructor <init>(Lcom/android/volley/toolbox/g$c;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/qihoo/security/appbox/c/a/b$c;->a:Lcom/android/volley/toolbox/g$c;

    .line 53
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$c;->a:Lcom/android/volley/toolbox/g$c;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/g$c;->a()V

    .line 48
    return-void
.end method
