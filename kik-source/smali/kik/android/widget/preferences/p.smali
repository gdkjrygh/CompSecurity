.class final Lkik/android/widget/preferences/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/m;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/m;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lkik/android/widget/preferences/p;->a:Lkik/android/widget/preferences/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 142
    new-instance v0, Lkik/a/f/f/ao;

    iget-object v2, p0, Lkik/android/widget/preferences/p;->a:Lkik/android/widget/preferences/m;

    iget-object v2, v2, Lkik/android/widget/preferences/m;->a:Lkik/a/d/aa;

    iget-object v4, v2, Lkik/a/d/aa;->a:Ljava/lang/String;

    move-object v2, v1

    move-object v3, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    invoke-direct/range {v0 .. v7}, Lkik/a/f/f/ao;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object v1, p0, Lkik/android/widget/preferences/p;->a:Lkik/android/widget/preferences/m;

    iget-object v1, v1, Lkik/android/widget/preferences/m;->d:Lkik/android/widget/preferences/KikEmailPreference;

    iget-object v1, v1, Lkik/android/widget/preferences/KikEmailPreference;->c:Lkik/a/e/f;

    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    .line 144
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 145
    iget-object v0, p0, Lkik/android/widget/preferences/p;->a:Lkik/android/widget/preferences/m;

    iget-object v0, v0, Lkik/android/widget/preferences/m;->d:Lkik/android/widget/preferences/KikEmailPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0900d6

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 146
    return-void
.end method
