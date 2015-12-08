.class final Lcom/roidapp/photogrid/release/lw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PathSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PathSelector;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const v6, 0xcc02

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 88
    new-instance v3, Ljava/io/File;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PathSelector;->a(Lcom/roidapp/photogrid/release/PathSelector;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v4, "test.jpg"

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    .line 99
    :goto_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-ne v4, v5, :cond_0

    if-eqz v0, :cond_0

    .line 101
    :try_start_1
    new-instance v4, Lcom/roidapp/photogrid/common/ae;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/PathSelector;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 102
    invoke-virtual {v4}, Lcom/roidapp/photogrid/common/ae;->b()Ljava/io/OutputStream;

    move-result-object v4

    .line 103
    const-string v5, "photogrid"

    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V

    .line 104
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 105
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 118
    :cond_0
    if-nez v0, :cond_4

    .line 119
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 120
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PathSelector;->b(Lcom/roidapp/photogrid/release/PathSelector;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 121
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 122
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 123
    iget-object v2, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/PathSelector;->a(Lcom/roidapp/photogrid/release/PathSelector;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    .line 125
    iget-object v3, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-static {v3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "SAVEPATH"

    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 130
    const-string v3, "file"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 132
    iget-object v1, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-virtual {v1, v6, v0}, Lcom/roidapp/photogrid/release/PathSelector;->setResult(ILandroid/content/Intent;)V

    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PathSelector;->finish()V

    .line 152
    :goto_1
    return-void

    :cond_1
    move v0, v2

    .line 92
    goto :goto_0

    .line 93
    :catch_0
    move-exception v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v0, v1

    goto :goto_0

    .line 106
    :catch_1
    move-exception v0

    .line 108
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 109
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 111
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 112
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/PathSelector;->a(Lcom/roidapp/photogrid/release/PathSelector;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_1

    .line 135
    :cond_3
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 136
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 137
    iget-object v2, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/PathSelector;->a(Lcom/roidapp/photogrid/release/PathSelector;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    .line 139
    iget-object v3, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-static {v3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "SAVEPATH"

    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 144
    const-string v3, "file"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 146
    iget-object v1, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-virtual {v1, v6, v0}, Lcom/roidapp/photogrid/release/PathSelector;->setResult(ILandroid/content/Intent;)V

    .line 147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PathSelector;->finish()V

    goto :goto_1

    .line 150
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/lw;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/PathSelector;->a(Lcom/roidapp/photogrid/release/PathSelector;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_1
.end method
