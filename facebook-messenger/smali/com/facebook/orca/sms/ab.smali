.class public Lcom/facebook/orca/sms/ab;
.super Ljava/lang/Object;
.source "MmsSmsInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/orca/sms/ab;->a:Landroid/content/Context;

    .line 28
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/sms/ab;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid_src/mms/g/l;->a(Landroid/content/Context;)V

    .line 34
    iget-object v0, p0, Lcom/facebook/orca/sms/ab;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid_src/mms/g/d;->a(Landroid/content/Context;)V

    .line 35
    iget-object v0, p0, Lcom/facebook/orca/sms/ab;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid_src/mms/transaction/d;->a(Landroid/content/Context;)V

    .line 36
    iget-object v0, p0, Lcom/facebook/orca/sms/ab;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid_src/mms/c;->a(Landroid/content/Context;)V

    .line 38
    iget-object v0, p0, Lcom/facebook/orca/sms/ab;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 40
    const-class v0, Lcom/facebook/orca/sms/a/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/a/c;

    .line 41
    iget-object v2, p0, Lcom/facebook/orca/sms/ab;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    sget-object v3, Landroid_src/c/l;->a:Landroid/net/Uri;

    invoke-virtual {v2, v3, v4, v0}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 44
    const-class v0, Lcom/facebook/orca/sms/a/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/a/b;

    .line 46
    iget-object v1, p0, Lcom/facebook/orca/sms/ab;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/j;->a:Landroid/net/Uri;

    invoke-virtual {v1, v2, v4, v0}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 48
    return-void
.end method
