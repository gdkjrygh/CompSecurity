.class Lcom/qihoo/security/leak/e$b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/leak/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/leak/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/leak/e$b;->a:Landroid/content/Context;

    .line 64
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;J)J
    .locals 2

    .prologue
    .line 98
    iget-object v0, p0, Lcom/qihoo/security/leak/e$b;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 103
    iget-object v0, p0, Lcom/qihoo/security/leak/e$b;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 104
    return-void
.end method
