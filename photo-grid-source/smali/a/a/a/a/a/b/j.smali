.class public final La/a/a/a/a/b/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 54
    invoke-static {p0}, La/a/a/a/a/b/j;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1093
    const/4 v0, 0x0

    .line 1095
    const-string v1, "io.fabric.ApiKey"

    const-string v2, "string"

    invoke-static {p0, v1, v2}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 1097
    if-nez v1, :cond_0

    .line 1098
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 1099
    const-string v1, "com.crashlytics.ApiKey"

    const-string v2, "string"

    invoke-static {p0, v1, v2}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 1102
    :cond_0
    if-eqz v1, :cond_1

    .line 1103
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 60
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1109
    invoke-static {}, La/a/a/a/f;->e()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p0}, La/a/a/a/a/b/l;->i(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1110
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1117
    const-string v1, "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>"

    .line 1110
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1112
    :cond_3
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Fabric"

    .line 2117
    const-string v3, "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>"

    .line 1112
    invoke-interface {v1, v2, v3}, La/a/a/a/s;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :cond_4
    return-object v0
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 68
    const/4 v0, 0x0

    .line 70
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 73
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 74
    if-eqz v1, :cond_0

    .line 75
    const-string v2, "io.fabric.ApiKey"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 77
    if-nez v0, :cond_0

    .line 78
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 80
    const-string v2, "com.crashlytics.ApiKey"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 89
    :cond_0
    :goto_0
    return-object v0

    .line 83
    :catch_0
    move-exception v1

    .line 86
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Caught non-fatal exception while retrieving apiKey: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method
