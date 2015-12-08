.class final Lkik/android/q$a;
.super Lkik/android/util/bf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:Landroid/content/Context;

.field private c:Lcom/kik/g/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    .line 74
    iput-object p1, p0, Lkik/android/q$a;->b:Landroid/content/Context;

    .line 75
    iput-object p2, p0, Lkik/android/q$a;->a:Landroid/net/Uri;

    .line 76
    iput-object p3, p0, Lkik/android/q$a;->c:Lcom/kik/g/p;

    .line 77
    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 66
    iget-object v0, p0, Lkik/android/q$a;->b:Landroid/content/Context;

    iget-object v1, p0, Lkik/android/q$a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/q$a;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    iget-object v0, p0, Lkik/android/q$a;->a:Landroid/net/Uri;

    iget-object v1, p0, Lkik/android/q$a;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lkik/android/util/e;->a(Landroid/net/Uri;Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    const/16 v1, 0x15

    invoke-static {v1}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/q$a;->b:Landroid/content/Context;

    iget-object v2, p0, Lkik/android/q$a;->a:Landroid/net/Uri;

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->revokeUriPermission(Landroid/net/Uri;I)V

    :cond_0
    return-object v0
.end method

.method protected final synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 66
    check-cast p1, Ljava/io/File;

    invoke-super {p0, p1}, Lkik/android/util/bf;->onCancelled(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 66
    check-cast p1, Ljava/io/File;

    iget-object v0, p0, Lkik/android/q$a;->c:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method
