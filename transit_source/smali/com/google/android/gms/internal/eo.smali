.class public final Lcom/google/android/gms/internal/eo;
.super Ljava/lang/Object;


# direct methods
.method public static final c(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 3

    const v0, 0x3d8024

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "version"

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    return-object p0
.end method
