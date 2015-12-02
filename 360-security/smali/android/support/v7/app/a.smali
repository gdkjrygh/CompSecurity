.class abstract Landroid/support/v7/app/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field final a:Landroid/support/v7/app/ActionBarActivity;

.field b:Z

.field c:Z

.field private d:Landroid/support/v7/app/ActionBar;

.field private e:Landroid/view/MenuInflater;

.field private f:Z


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Landroid/support/v7/app/a;->a:Landroid/support/v7/app/ActionBarActivity;

    .line 76
    return-void
.end method

.method static a(Landroid/support/v7/app/ActionBarActivity;)Landroid/support/v7/app/a;
    .locals 2

    .prologue
    .line 47
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_0

    .line 48
    new-instance v0, Landroid/support/v7/app/b;

    invoke-direct {v0, p0}, Landroid/support/v7/app/b;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 58
    :goto_0
    return-object v0

    .line 49
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    .line 50
    new-instance v0, Landroid/support/v7/app/g;

    invoke-direct {v0, p0}, Landroid/support/v7/app/g;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    goto :goto_0

    .line 51
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 52
    new-instance v0, Landroid/support/v7/app/f;

    invoke-direct {v0, p0}, Landroid/support/v7/app/f;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    goto :goto_0

    .line 53
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_3

    .line 54
    new-instance v0, Landroid/support/v7/app/e;

    invoke-direct {v0, p0}, Landroid/support/v7/app/e;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    goto :goto_0

    .line 55
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_4

    .line 56
    new-instance v0, Landroid/support/v7/app/d;

    invoke-direct {v0, p0}, Landroid/support/v7/app/d;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    goto :goto_0

    .line 58
    :cond_4
    new-instance v0, Landroid/support/v7/app/c;

    invoke-direct {v0, p0}, Landroid/support/v7/app/c;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    goto :goto_0
.end method


# virtual methods
.method abstract a()Landroid/support/v7/app/ActionBar;
.end method

.method abstract a(I)V
.end method

.method abstract a(Landroid/content/res/Configuration;)V
.end method

.method a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 106
    iget-object v0, p0, Landroid/support/v7/app/a;->a:Landroid/support/v7/app/ActionBarActivity;

    sget-object v1, Landroid/support/v7/a/a$j;->ActionBarWindow:[I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 108
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 109
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 114
    :cond_0
    invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/app/a;->b:Z

    .line 115
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/app/a;->c:Z

    .line 116
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 118
    iget-object v0, p0, Landroid/support/v7/app/a;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-static {v0}, Landroid/support/v4/app/l;->b(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 119
    iget-object v0, p0, Landroid/support/v7/app/a;->d:Landroid/support/v7/app/ActionBar;

    if-nez v0, :cond_2

    .line 120
    iput-boolean v3, p0, Landroid/support/v7/app/a;->f:Z

    .line 125
    :cond_1
    :goto_0
    return-void

    .line 122
    :cond_2
    iget-object v0, p0, Landroid/support/v7/app/a;->d:Landroid/support/v7/app/ActionBar;

    invoke-virtual {v0, v3}, Landroid/support/v7/app/ActionBar;->c(Z)V

    goto :goto_0
.end method

.method abstract a(Landroid/view/View;)V
.end method

.method abstract a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method abstract a(Ljava/lang/CharSequence;)V
.end method

.method abstract a(ILandroid/view/Menu;)Z
.end method

.method abstract a(ILandroid/view/MenuItem;)Z
.end method

.method abstract a(ILandroid/view/View;Landroid/view/Menu;)Z
.end method

.method a(Landroid/view/View;Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 153
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 157
    iget-object v0, p0, Landroid/support/v7/app/a;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p2}, Landroid/support/v7/app/ActionBarActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    .line 159
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/a;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->b(Landroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method final b()Landroid/support/v7/app/ActionBar;
    .locals 2

    .prologue
    .line 83
    iget-boolean v0, p0, Landroid/support/v7/app/a;->b:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/app/a;->c:Z

    if-eqz v0, :cond_2

    .line 84
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/a;->d:Landroid/support/v7/app/ActionBar;

    if-nez v0, :cond_1

    .line 85
    invoke-virtual {p0}, Landroid/support/v7/app/a;->a()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/a;->d:Landroid/support/v7/app/ActionBar;

    .line 87
    iget-boolean v0, p0, Landroid/support/v7/app/a;->f:Z

    if-eqz v0, :cond_1

    .line 88
    iget-object v0, p0, Landroid/support/v7/app/a;->d:Landroid/support/v7/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->c(Z)V

    .line 95
    :cond_1
    :goto_0
    iget-object v0, p0, Landroid/support/v7/app/a;->d:Landroid/support/v7/app/ActionBar;

    return-object v0

    .line 93
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/app/a;->d:Landroid/support/v7/app/ActionBar;

    goto :goto_0
.end method

.method abstract b(I)Landroid/view/View;
.end method

.method abstract b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method c()Landroid/view/MenuInflater;
    .locals 2

    .prologue
    .line 99
    iget-object v0, p0, Landroid/support/v7/app/a;->e:Landroid/view/MenuInflater;

    if-nez v0, :cond_0

    .line 100
    new-instance v0, Landroid/support/v7/internal/view/SupportMenuInflater;

    invoke-virtual {p0}, Landroid/support/v7/app/a;->j()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/internal/view/SupportMenuInflater;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/app/a;->e:Landroid/view/MenuInflater;

    .line 102
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/a;->e:Landroid/view/MenuInflater;

    return-object v0
.end method

.method abstract d()V
.end method

.method abstract e()V
.end method

.method abstract f()V
.end method

.method abstract g()Z
.end method

.method abstract h()V
.end method

.method protected final i()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 188
    :try_start_0
    iget-object v1, p0, Landroid/support/v7/app/a;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 189
    iget-object v2, p0, Landroid/support/v7/app/a;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v2}, Landroid/support/v7/app/ActionBarActivity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v1

    .line 193
    iget-object v2, v1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    .line 194
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string/jumbo v2, "android.support.UI_OPTIONS"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 200
    :cond_0
    :goto_0
    return-object v0

    .line 197
    :catch_0
    move-exception v1

    .line 198
    const-string/jumbo v1, "ActionBarActivityDelegate"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "getUiOptionsFromMetadata: Activity \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Landroid/support/v7/app/a;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\' not in manifest"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method protected final j()Landroid/content/Context;
    .locals 2

    .prologue
    .line 205
    iget-object v0, p0, Landroid/support/v7/app/a;->a:Landroid/support/v7/app/ActionBarActivity;

    .line 208
    invoke-virtual {p0}, Landroid/support/v7/app/a;->b()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    .line 209
    if-eqz v1, :cond_0

    .line 210
    invoke-virtual {v1}, Landroid/support/v7/app/ActionBar;->d()Landroid/content/Context;

    move-result-object v0

    .line 212
    :cond_0
    return-object v0
.end method
