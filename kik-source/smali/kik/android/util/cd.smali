.class final Lkik/android/util/cd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/bc;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/net/Uri;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Lkik/android/util/cc;


# direct methods
.method constructor <init>(Lkik/android/util/cc;Lcom/kik/view/adapters/bc;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lkik/android/util/cd;->g:Lkik/android/util/cc;

    iput-object p2, p0, Lkik/android/util/cd;->a:Lcom/kik/view/adapters/bc;

    iput-object p3, p0, Lkik/android/util/cd;->b:Ljava/lang/String;

    iput-object p4, p0, Lkik/android/util/cd;->c:Landroid/net/Uri;

    iput-object p5, p0, Lkik/android/util/cd;->d:Ljava/lang/String;

    iput-object p6, p0, Lkik/android/util/cd;->e:Ljava/lang/String;

    iput-object p7, p0, Lkik/android/util/cd;->f:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .prologue
    .line 119
    iget-object v0, p0, Lkik/android/util/cd;->a:Lcom/kik/view/adapters/bc;

    invoke-virtual {v0, p2}, Lcom/kik/view/adapters/bc;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 120
    iget-object v1, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 121
    iget-object v2, p0, Lkik/android/util/cd;->b:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 122
    iget-object v2, p0, Lkik/android/util/cd;->g:Lkik/android/util/cc;

    invoke-static {v2}, Lkik/android/util/cc;->a(Lkik/android/util/cc;)Lcom/kik/android/a;

    move-result-object v2

    const-string v3, "Share Code Completed"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Colour"

    iget-object v4, p0, Lkik/android/util/cd;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->b()V

    .line 127
    :goto_0
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 128
    const-string v3, "android.intent.extra.STREAM"

    iget-object v4, p0, Lkik/android/util/cd;->c:Landroid/net/Uri;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 129
    const-string v3, "android.intent.extra.SUBJECT"

    iget-object v4, p0, Lkik/android/util/cd;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 130
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    const/high16 v0, 0x80000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 134
    const-string v0, "com.facebook.katana"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 135
    iget-object v0, p0, Lkik/android/util/cd;->e:Ljava/lang/String;

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 136
    const-string v0, "text/plain"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    const-string v0, "android.intent.extra.TEXT"

    iget-object v1, p0, Lkik/android/util/cd;->e:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 149
    :goto_1
    iget-object v0, p0, Lkik/android/util/cd;->g:Lkik/android/util/cc;

    invoke-static {v0}, Lkik/android/util/cc;->b(Lkik/android/util/cc;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 150
    return-void

    .line 125
    :cond_0
    iget-object v2, p0, Lkik/android/util/cd;->g:Lkik/android/util/cc;

    invoke-static {v2}, Lkik/android/util/cc;->a(Lkik/android/util/cc;)Lcom/kik/android/a;

    move-result-object v2

    const-string v3, "Share Profile Completed"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Shared Via"

    invoke-virtual {v2, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    .line 141
    :cond_1
    const-string v0, "image/*"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 145
    :cond_2
    const-string v0, "android.intent.extra.TEXT"

    iget-object v1, p0, Lkik/android/util/cd;->f:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 146
    const-string v0, "image/*"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1
.end method
